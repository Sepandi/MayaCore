package Maya.Core;

import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.awt.*;

public class Window extends JPanel implements Runnable{
    //--Window
    public static JFrame win = new JFrame("MayaCore Window");

    //--Main-Thread
    Thread thread;

    //--Graphic-Module
    public static Graphics2D g2;


    //--Deltatime-And-FPS-Variables
    float deltaTime;
    float fps;
    int WANTED_FPS = 60;


    //--Game-Functions
    public void OnRun(){}
    public void Update(){}
    public void Draw(){}

    //--Utiles----------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------------------------
    public void ChangeBackgroundColor(Color color){
        setBackground(color);
    }

    public void SetWindowSize(int width,int height){
        setPreferredSize(new Dimension(width,height));
        Container c = getTopLevelAncestor();
        if (c instanceof JFrame) {
            JFrame f = (JFrame) c;
            f.pack();
        }
    }

    public void SetWindowFullscreen(Boolean status){
        if (status){
            GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0].setFullScreenWindow(Window.win);
        }else{
            GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0].setFullScreenWindow(null);
        }

    }

    public float GetDeltaTime(){
        return deltaTime/1000000000;
    }

    public float GetFPS(){
        return Math.round(fps);
    }


    public int GetWindowWidth(){
        return getWidth();
    }


    public int GetWindowHeight(){
        return getHeight();
    }


    public void SetWindowTitle(String name){
        Window.win.setTitle(name);
    }
    public void SetResizable(Boolean setResizable){
        win.setResizable(setResizable);
    }


    public void SetWindowIcon(String path){
        //loading an image from a file
        final Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        final URL imageResource = Window.class.getClassLoader().getResource(path);
        final Image image = defaultToolkit.getImage(imageResource);
        final Taskbar taskbar = Taskbar.getTaskbar();

        try {
            //set icon for mac os (and other systems which do support this method)
            taskbar.setIconImage(image);
        } catch (final UnsupportedOperationException e) {}
        catch (final SecurityException e) {
            Utils.Log("There was a security exception for: 'taskbar.setIconImage'");
        }
        Window.win.setIconImage(image);
    }

    public void CloseWindow(){
        System.exit(0);
    }
    public void ShowWindow(Boolean showable){
        Window.win.setVisible(showable);
    }

    //--GameLoop--------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------------------------
    //--Setups-The-Renderer
    void Init(){

        //--Renderer's-Configs
        setPreferredSize(new Dimension(600, 400));
        setBackground(new Color(255, 255, 225, 255));
        setDoubleBuffered(true);
        addKeyListener(new KeyHandler());
        setFocusable(true);
        addMouseListener(new Mouse());
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent eventListener) {
                //Renderer.this.game.onWindowResize();
            }
            });
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(true);
        win.add(this);
        win.pack();
        win.setLocation(0,0);
        win.toFront();
    }



    //--Get-Called-when-Game-Gets-Runned-By-Main-Class
    public void Start(){
        Init();
        OnRun();
        thread = new Thread(this,"MayaCore Game Thread");
        thread.start();
    }

    //--Game-Main-Thread
    @Override
    public void run() {


        double drawInterval = 1000000000 / WANTED_FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;
        long lastTime = System.nanoTime();

        int totalFrames = 0;
        long lastFPSCheck = 0;
        win.setVisible(true);
        while (thread != null) {
            long time = System.nanoTime();
            Update();
            repaint();
            // Gets FPS
            totalFrames++;
            if (System.nanoTime()> lastFPSCheck + 1000000000){
                lastFPSCheck = System.nanoTime();
                fps = totalFrames;
                totalFrames = 0;
            }

            // Gets DeltaTime
            float beginTime = System.nanoTime() / 10000000;
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime / 1000000);
                nextDrawTime += drawInterval;
                float endTime = System.nanoTime() / 1000000;
                deltaTime = endTime - beginTime;

            } catch (InterruptedException e) {}

            deltaTime = (float)((time - lastTime));
            lastTime = time;
        }
    }

    //--DrawLoop
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D)g;
        Draw();
        g2.dispose();
    }






}