package Maya.Core;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.RenderingHints;
import java.io.IOException;
import java.net.URL;

public class Fonts {
    public static Fonts defaultFont = new Fonts("Maya/Core/CoreAssets/GeminiType.otf", 16);
    Font customFont;

    public Fonts(String fontPath, int size) {
        URL resource = Window.class.getClassLoader().getResource(fontPath);
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, resource.openStream());
            customFont = customFont.deriveFont(Font.PLAIN, size);
        } catch (FontFormatException e) {
            Utils.LogError("Font not Found");
        } catch (IOException e) {
            Utils.LogError("Font not Found");
        }
    }

    public static void DrawString(String text, Fonts font, java.awt.Color color, int x, int y) {
        Window.g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        Window.g2.setFont(font.customFont);
        Window.g2.setColor(color);
        int fm = Window.g2.getFontMetrics(font.customFont).getAscent();
        Window.g2.drawString(text, x, y + fm);
    }

}
