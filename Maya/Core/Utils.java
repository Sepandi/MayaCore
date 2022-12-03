package Maya.Core;


public class Utils {
    public static String ToString(Object paramObject) {
        return String.valueOf(paramObject);
    }
    
    public static void Log(Object object) {
        System.out.println("\033[0;106m\033[36m[DEBUG]\033[0m\033[36m" + object + "\033[0m");
    }
    
    public static void LogError(Object object) {
        System.out.println("\033[43m\033[1;31m[ERROR]\033[0m\033[1;31m [ " + object + " ]\033[0m");
    }


    public static void DebugScreen(String gameTitle,String version,Window win){
        if (KeyHandler.F3){
            Fonts.DrawString(gameTitle+version, Fonts.defaultFont, Color.WHITE, 0, 5);
            Fonts.DrawString("FPS : "+ToString(win.GetFPS()), Fonts.defaultFont, Color.WHITE, 0, 20);
            Fonts.DrawString("DeltaTime : "+ToString(win.GetDeltaTime()), Fonts.defaultFont, Color.WHITE, 0, 35);
        }
        
    }
  
}
