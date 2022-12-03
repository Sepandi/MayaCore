package Game;

import java.util.ArrayList;
import java.util.List;

public class World {
    public int originX = 0;

    public int originY = 0;

    List<Tiles> tiles = new ArrayList<>();
    public World(){
        for (int y = 0; y < Maps.map1.length; y++) {
            for (int x = 0; x < Maps.map1[y].length; x++){
                tiles.add(new Tiles(Maps.map1[y][x]));
            }         
        }
    }
    public void Update(){
        int tileNumber = 0;
        for (int y = 0; y < Maps.map1.length; y++) {
            for (int x = 0; x < Maps.map1[y].length; x++){
                tiles.get(tileNumber).Update(originX+(Tiles.tileSize*x),originY+(Tiles.tileSize*y));
                tileNumber++;
            }         
        }
    }
    public void Draw(){
        int tileNumber = 0;
        for (int y = 0; y < Maps.map1.length; y++) {
            for (int x = 0; x < Maps.map1[y].length; x++){
                tiles.get(tileNumber).Draw();
                tileNumber++;
            }         
        }
    }
}
