package Game;

import java.util.Random;

import Maya.Core.Color;
import Maya.Core.Fonts;
import Maya.Core.Rect;
import Maya.Core.Texture;
import Maya.Core.Utils;

public class Tiles {
    // tiles sizes
    public static int tileSize = 128;

    // The land Type
    boolean isLand;
    boolean itIsAWindyWater;

    // textures 
    Texture windyWater;

    // windy water animation
    int windyWaterAnimTimer;
    int windyWaterAnimFrame;

    // Tile's Rect
    public Rect rect;
    public Tiles(int type){
        // init's tile's rect
        rect = new Rect(0,0,tileSize,tileSize);

        // Sets the land type
        if (type == 0){


            // water type
            isLand = false;
            
            // make a water tile windy
            if (new Random().nextInt(15) == 8){
                itIsAWindyWater = true;
                // set the texture
                windyWater = new Texture("Data/Tiles/WindyWater.png");
            }
            // windy water animation properties
            windyWaterAnimTimer = 0;
            windyWaterAnimFrame = 0;

        }else if (type == 1){
            // land type
            isLand = true;
        }
    }
    public void Update(int x,int y){
        rect.x = x;
        rect.y = y;

        /* 
        // windy water animation
        if (itIsAWindyWater){
            windyWaterAnimTimer += 1;

            if (windyWaterAnimTimer >= 0 && windyWaterAnimTimer <= 50){
                windyWaterAnimFrame = 0;
            }
            if (windyWaterAnimTimer >= 50 && windyWaterAnimTimer <= 100){
                windyWaterAnimFrame = 1;
            }

            if (windyWaterAnimTimer >= 100){
                windyWaterAnimTimer = 0;
            }
        }
        */
    }

    public void Draw(){
        if (isLand){
            Rect.DrawRect(rect,new Color(143,100, 0, 255));
        }
        
        if (itIsAWindyWater){
            Texture.DrawImage(windyWater,rect.x,rect.y, 8,false);
            
            //Fonts.DrawString(Utils.ToString(windyWaterAnimFrame), Fonts.defaultFont, Color.BLACK,rect.x, rect.y);
            //Fonts.DrawString(Utils.ToString(windyWaterAnimTimer), Fonts.defaultFont, Color.BLACK,rect.x+16, rect.y);
        }
        
    }
}
