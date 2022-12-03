package Maya.Core;

public class Circle {
    public static void DrawCenteredCircle(int x, int y, int r,Color color) {
        x = x-(r/2);
        y = y-(r/2);
        Window.g2.setColor(color.color);
        Window.g2.fillOval(x,y,r,r);
    }
    public static void DrawCircle(int x, int y, int r,Color color) {
        Window.g2.setColor(color.color);
        Window.g2.fillOval(x,y,r,r);
    }
}
