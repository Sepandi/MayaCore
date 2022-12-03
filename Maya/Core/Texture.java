package Maya.Core;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Texture {
    public BufferedImage image = null;

    public Texture(String path) {
        try {
            image = ImageIO.read(Window.class.getResourceAsStream("/"+path));
        } catch (IOException e) {
            System.out.println("Couldn't Load /"+path);
        }
    }
    public int GetWidth(){
        return this.image.getWidth(null);
    }
    public int GetHeight(){
        return this.image.getHeight(null);
    }

    public void DrawImageFromSpriteSheet(int x, int y,Rect wantedRect,int size,boolean flipedWidth){
        if (flipedWidth){
            Window.g2.drawImage(image, x+GetWidth()*size, y, image.getWidth(null)*size*-1, image.getHeight(null)*size,wantedRect.x,wantedRect.y,wantedRect.width,wantedRect.height, null);         
        }else if (!flipedWidth){
            Window.g2.drawImage(image, x, y, image.getWidth(null)*size, image.getHeight(null)*size,null, null);         
        }
        image.flush();
    }

    public static void DrawImage(Texture images, int x, int y,int size,boolean flipedWidth) {
        if (flipedWidth){
            Window.g2.drawImage(images.image, x+images.GetWidth()*size, y, images.image.getWidth(null)*size*-1, images.image.getHeight(null)*size,null, null);         
        }else if (!flipedWidth){
            Window.g2.drawImage(images.image, x, y, images.image.getWidth(null)*size, images.image.getHeight(null)*size,null, null);         
        }
    }

    public static void DrawImage(BufferedImage images, int x, int y,int size,boolean flipedWidth) {
        if (flipedWidth){
            Window.g2.drawImage(images, x+images.getWidth(null)*size, y, images.getWidth(null)*size*-1, images.getHeight(null)*size,null, null);         
        }else if (!flipedWidth){
            Window.g2.drawImage(images, x, y, images.getWidth(null)*size, images.getHeight(null)*size,null, null);         
        }
    }

}
