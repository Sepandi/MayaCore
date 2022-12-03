package Maya.Core;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.event.MouseInputListener;

public class Mouse implements MouseInputListener {
    public static Boolean mouseLeftClicked = Boolean.valueOf(false);

    public static int X() {
        return (MouseInfo.getPointerInfo().getLocation()).x - (Window.win.getLocation()).x;
    }

    public static int Y() {
        return (MouseInfo.getPointerInfo().getLocation()).y - (Window.win.getLocation()).y - 30;
    }

    public static void SetCursorImage(String paramString) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        URL uRL = Window.class.getClassLoader().getResource(paramString);
        Image image = toolkit.getImage(uRL);
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(image, new Point(0, 0), "blank cursor");
        Window.win.setCursor(cursor);
    }

    public static void HideCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        URL uRL = Window.class.getClassLoader().getResource("Maya/Core/CoreAssets/emptyCursor.png");
        Image image = toolkit.getImage(uRL);
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(image, new Point(0, 0), "blank cursor");
        Window.win.setCursor(cursor);
    }

    public void mouseClicked(MouseEvent paramMouseEvent) {
    }

    public void mousePressed(MouseEvent paramMouseEvent) {
        if (paramMouseEvent.getButton() == 1) {
            mouseLeftClicked = Boolean.valueOf(true);
        } else {
            mouseLeftClicked = Boolean.valueOf(false);
        }
    }

    public void mouseReleased(MouseEvent paramMouseEvent) {
        if (paramMouseEvent.getButton() == 1)
            mouseLeftClicked = Boolean.valueOf(false);
    }

    public void mouseEntered(MouseEvent paramMouseEvent) {
    }

    public void mouseExited(MouseEvent paramMouseEvent) {
    }

    public void mouseDragged(MouseEvent paramMouseEvent) {
    }

    public void mouseMoved(MouseEvent paramMouseEvent) {
    }
}