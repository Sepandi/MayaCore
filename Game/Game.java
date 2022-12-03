package Game;

import Maya.Core.*;

public class Game extends Window{
    Texture player;
    Vector2 pos = new Vector2(0, 100);
    int speed = 300;

    World world;

    public void OnRun(){
        ChangeBackgroundColor(new Color(53,155,255,255));
        SetWindowSize(800, 700);
        SetWindowTitle("TEST");
        player = new Texture("Data/Player.png");
        world = new World();
    }

    public void Update(){
        if (KeyHandler.ESC){
            CloseWindow();
        }
        if (KeyHandler.W){
            world.originY += GetDeltaTime()*300;
        }
        if (KeyHandler.S){
            world.originY -= GetDeltaTime()*300;
        }
        if (KeyHandler.A){
            world.originX += GetDeltaTime()*300;
        }
        if (KeyHandler.D){
            world.originX -= GetDeltaTime()*300;
        }

        world.Update();

    }

    public void Draw(){
        
        world.Draw();
        Utils.DebugScreen("TEST", "DevTEST",this);
    }

    public void onWindowResize(){

    }
}
