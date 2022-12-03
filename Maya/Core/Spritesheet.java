package Maya.Core;

import java.awt.image.BufferedImage;

public class Spritesheet {
    Texture sprite;

    public Spritesheet(String path) {
        this.sprite = new Texture(path);
    }

    public BufferedImage GetImage(Rect wantedRect) {
        return this.sprite.image.getSubimage(wantedRect.x, wantedRect.y, wantedRect.width, wantedRect.height);
    }
}
