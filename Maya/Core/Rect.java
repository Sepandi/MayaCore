package Maya.Core;

public class Rect {
    public int x;

    public int y;

    public int width;

    public int height;

    public Rect(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean CollidesWith(Rect paramRect) {
        int i = this.width;
        int j = this.height;
        int k = paramRect.width;
        int m = paramRect.height;
        if (k <= 0 || m <= 0 || i <= 0 || j <= 0)
            return false;
        int n = this.x;
        int i1 = this.y;
        int i2 = paramRect.x;
        int i3 = paramRect.y;
        k += i2;
        m += i3;
        i += n;
        j += i1;
        return ((k < i2 || k > n) && (m < i3 || m > i1) && (i < n || i > i2) && (j < i1 || j > i3));
    }

    public static void DrawRect(Rect rect, java.awt.Color color) {
        Window.g2.setColor(color);
        Window.g2.fillRect(rect.x, rect.y, rect.width, rect.height);
    }
}
