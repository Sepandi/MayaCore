package Maya.Core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    public static boolean A;
    public static boolean B;
    public static boolean C;
    public static boolean D;
    public static boolean E;
    public static boolean F;
    public static boolean G;
    public static boolean H;
    public static boolean I;
    public static boolean J;
    public static boolean K;
    public static boolean L;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    public static boolean P;
    public static boolean Q;
    public static boolean R;
    public static boolean S;
    public static boolean T;
    public static boolean U;
    public static boolean V;
    public static boolean W;
    public static boolean X;
    public static boolean Y;
    public static boolean Z;
    public static boolean F1;
    public static boolean F2;
    public static boolean F3;
    public static boolean F4;
    public static boolean F5;
    public static boolean F6;
    public static boolean F7;
    public static boolean F8;
    public static boolean F9;
    public static boolean F10;
    public static boolean F11;
    public static boolean F12;
    public static boolean ESC;
    public static boolean SPACE;
    public static boolean ENTER;
    public static boolean TAB;
    public static boolean SHIFT;
    public static boolean CTRL;
    public static boolean ALT;
    public static boolean UP;
    public static boolean DOWN;
    public static boolean LEFT;
    public static boolean RIGHT;
    public static boolean BACKQUOTE;
    public static boolean BACKSPACE;
    public static boolean DELETE;
    public static boolean QUOTE;
    public static boolean MINUS;
    public static boolean PERIOD; 
    public static boolean EQUALS;  
    public static boolean LESS; 
    public static boolean COMMA; 
    public static boolean SEMICOLON; 
    public static boolean BACKSLASH;
    public static boolean N_1;
    public static boolean N_2;
    public static boolean N_3;
    public static boolean N_4;
    public static boolean N_5;
    public static boolean N_6;
    public static boolean N_7;
    public static boolean N_8;
    public static boolean N_9;
    public static boolean N_0;
    
    

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_F1) {
            F1 = true;
        }
        if (code == KeyEvent.VK_F2) {
            F2 = true;
        }
        if (code == KeyEvent.VK_F3) {
            F3 = true;
        }
        if (code == KeyEvent.VK_F4) {
            F4 = true;
        }
        if (code == KeyEvent.VK_F5) {
            F5 = true;
        }
        if (code == KeyEvent.VK_F6) {
            F6 = true;
        }
        if (code == KeyEvent.VK_F7) {
            F7 = true;
        }
        if (code == KeyEvent.VK_F8) {
            F8 = true;
        }
        if (code == KeyEvent.VK_F9) {
            F9 = true;
        }
        if (code == KeyEvent.VK_F10) {
            F10 = true;
        }
        if (code == KeyEvent.VK_F11) {
            F11 = true;
        }
        if (code == KeyEvent.VK_F12) {
            F12 = true;
        }
        if (code == KeyEvent.VK_ESCAPE) {
            ESC = true;
        }
        if (code == KeyEvent.VK_SPACE) {
            SPACE = true;
        }
        if (code == KeyEvent.VK_ENTER) {
            ENTER = true;
        }
        if (code == KeyEvent.VK_TAB) {
            TAB = true;
        }
        if (code == KeyEvent.VK_SHIFT) {
            SHIFT= true;
        }
        if (code == KeyEvent.VK_CONTROL) {
            CTRL = true;
        }
        if (code == KeyEvent.VK_ALT) {
            ALT = true;
        }
        if (code == KeyEvent.VK_UP) {
            UP = true;
        }
        if (code == KeyEvent.VK_DOWN) {
            DOWN = true;
        }
        if (code == KeyEvent.VK_LEFT) {
            LEFT = true;
        }
        if (code == KeyEvent.VK_RIGHT) {
            RIGHT = true;
        }
        if (code == KeyEvent.VK_BACK_QUOTE) {
            BACKQUOTE = true;
        }
        if (code == KeyEvent.VK_BACK_SPACE) {
            BACKSPACE = true;
        }
        if (code == KeyEvent.VK_DELETE) {
            DELETE = true;
        }
        if (code == KeyEvent.VK_QUOTE) {
            QUOTE = true;
        }
        if (code == KeyEvent.VK_MINUS) {
            MINUS = true;
        }
        if (code == KeyEvent.VK_PERIOD) {
            PERIOD= true;
        }
        if (code == KeyEvent.VK_EQUALS) {
            EQUALS = true;
        }
        if (code == KeyEvent.VK_LESS) {
            LESS = true;
        }
        if (code == KeyEvent.VK_COMMA) {
            COMMA = true;
        }
        if (code == KeyEvent.VK_SEMICOLON) {
            SEMICOLON = true;
        }
        if (code == KeyEvent.VK_BACK_SLASH) {
            BACKSLASH = true;
        }
        if (code == KeyEvent.VK_A) {
            A = true;
        }
        if (code == KeyEvent.VK_B) {
            B = true;
        }
        if (code == KeyEvent.VK_C) {
            C = true;
        }
        if (code == KeyEvent.VK_D) {
            D = true;
        }
        if (code == KeyEvent.VK_E) {
            E = true;
        }
        if (code == KeyEvent.VK_F) {
            F = true;
        }
        if (code == KeyEvent.VK_G) {
            G = true;
        }
        if (code == KeyEvent.VK_H) {
            H = true;
        }
        if (code == KeyEvent.VK_I) {
            I = true;
        }
        if (code == KeyEvent.VK_J) {
            J = true;
        }
        if (code == KeyEvent.VK_K) {
            K = true;
        }
        if (code == KeyEvent.VK_L) {
            L = true;
        }
        if (code == KeyEvent.VK_M) {
            M = true;
        }
        if (code == KeyEvent.VK_N) {
            N = true;
        }
        if (code == KeyEvent.VK_O) {
            O = true;
        }
        if (code == KeyEvent.VK_P) {
            P = true;
        }
        if (code == KeyEvent.VK_Q) {
            Q = true;
        }
        if (code == KeyEvent.VK_R) {
            R = true;
        }
        if (code == KeyEvent.VK_S) {
            S = true;
        }
        if (code == KeyEvent.VK_T) {
            T = true;
        }
        if (code == KeyEvent.VK_U) {
            U = true;
        }
        if (code == KeyEvent.VK_V) {
            V = true;
        }
        if (code == KeyEvent.VK_W) {
            W = true;
        }
        if (code == KeyEvent.VK_X) {
            X = true;
        }
        if (code == KeyEvent.VK_Y) {
            Y = true;
        }
        if (code == KeyEvent.VK_Z) {
            Z = true;
        }
        if (code == KeyEvent.VK_1) {
            N_1 = true;
        }
        if (code == KeyEvent.VK_2) {
            N_2 = true;
        }
        if (code == KeyEvent.VK_3) {
            N_3 = true;
        }
        if (code == KeyEvent.VK_4) {
            N_4 = true;
        }
        if (code == KeyEvent.VK_5) {
            N_5 = true;
        }
        if (code == KeyEvent.VK_6) {
            N_6 = true;
        }
        if (code == KeyEvent.VK_7) {
            N_7 = true;
        }
        if (code == KeyEvent.VK_8) {
            N_8 = true;
        }
        if (code == KeyEvent.VK_9) {
            N_9 = true;
        }
        if (code == KeyEvent.VK_0) {
            N_0 = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_F1) {
            F1 = false;
        }
        if (code == KeyEvent.VK_F2) {
            F2 = false;
        }
        if (code == KeyEvent.VK_F3) {
            F3 = false;
        }
        if (code == KeyEvent.VK_F4) {
            F4 = false;
        }
        if (code == KeyEvent.VK_F5) {
            F5 = false;
        }
        if (code == KeyEvent.VK_F6) {
            F6 = false;
        }
        if (code == KeyEvent.VK_F7) {
            F7 = false;
        }
        if (code == KeyEvent.VK_F8) {
            F8 = false;
        }
        if (code == KeyEvent.VK_F9) {
            F9 = false;
        }
        if (code == KeyEvent.VK_F10) {
            F10 = false;
        }
        if (code == KeyEvent.VK_F11) {
            F11 = false;
        }
        if (code == KeyEvent.VK_F12) {
            F12 = false;
        }
        if (code == KeyEvent.VK_ESCAPE) {
            ESC = false;
        }
        if (code == KeyEvent.VK_SPACE) {
            SPACE = false;
        }
        if (code == KeyEvent.VK_ENTER) {
            ENTER = false;
        }
        if (code == KeyEvent.VK_TAB) {
            TAB = false;
        }
        if (code == KeyEvent.VK_SHIFT) {
            SHIFT= false;
        }
        if (code == KeyEvent.VK_CONTROL) {
            CTRL = false;
        }
        if (code == KeyEvent.VK_ALT) {
            ALT = false;
        }
        if (code == KeyEvent.VK_UP) {
            UP = false;
        }
        if (code == KeyEvent.VK_DOWN) {
            DOWN = false;
        }
        if (code == KeyEvent.VK_LEFT) {
            LEFT = false;
        }
        if (code == KeyEvent.VK_RIGHT) {
            RIGHT = false;
        }
        if (code == KeyEvent.VK_BACK_QUOTE) {
            BACKQUOTE = false;
        }
        if (code == KeyEvent.VK_BACK_SPACE) {
            BACKSPACE = false;
        }
        if (code == KeyEvent.VK_DELETE) {
            DELETE = false;
        }
        if (code == KeyEvent.VK_QUOTE) {
            QUOTE = false;
        }
        if (code == KeyEvent.VK_MINUS) {
            MINUS = false;
        }
        if (code == KeyEvent.VK_PERIOD) {
            PERIOD= false;
        }
        if (code == KeyEvent.VK_EQUALS) {
            EQUALS = false;
        }
        if (code == KeyEvent.VK_LESS) {
            LESS = false;
        }
        if (code == KeyEvent.VK_COMMA) {
            COMMA = false;
        }
        if (code == KeyEvent.VK_SEMICOLON) {
            SEMICOLON = false;
        }
        if (code == KeyEvent.VK_BACK_SLASH) {
            BACKSLASH = false;
        }
        if (code == KeyEvent.VK_A) {
            A = false;
        }
        if (code == KeyEvent.VK_B) {
            B = false;
        }
        if (code == KeyEvent.VK_C) {
            C = false;
        }
        if (code == KeyEvent.VK_D) {
            D = false;
        }
        if (code == KeyEvent.VK_E) {
            E = false;
        }
        if (code == KeyEvent.VK_F) {
            F = false;
        }
        if (code == KeyEvent.VK_G) {
            G = false;
        }
        if (code == KeyEvent.VK_H) {
            H = false;
        }
        if (code == KeyEvent.VK_I) {
            I = false;
        }
        if (code == KeyEvent.VK_J) {
            J = false;
        }
        if (code == KeyEvent.VK_K) {
            K = false;
        }
        if (code == KeyEvent.VK_L) {
            L = false;
        }
        if (code == KeyEvent.VK_M) {
            M = false;
        }
        if (code == KeyEvent.VK_N) {
            N = false;
        }
        if (code == KeyEvent.VK_O) {
            O = false;
        }
        if (code == KeyEvent.VK_P) {
            P = false;
        }
        if (code == KeyEvent.VK_Q) {
            Q = false;
        }
        if (code == KeyEvent.VK_R) {
            R = false;
        }
        if (code == KeyEvent.VK_S) {
            S = false;
        }
        if (code == KeyEvent.VK_T) {
            T = false;
        }
        if (code == KeyEvent.VK_U) {
            U = false;
        }
        if (code == KeyEvent.VK_V) {
            V = false;
        }
        if (code == KeyEvent.VK_W) {
            W = false;
        }
        if (code == KeyEvent.VK_X) {
            X = false;
        }
        if (code == KeyEvent.VK_Y) {
            Y = false;
        }
        if (code == KeyEvent.VK_Z) {
            Z = false;
        }
        if (code == KeyEvent.VK_1) {
            N_1 = false;
        }
        if (code == KeyEvent.VK_2) {
            N_2 = false;
        }
        if (code == KeyEvent.VK_3) {
            N_3 = false;
        }
        if (code == KeyEvent.VK_4) {
            N_4 = false;
        }
        if (code == KeyEvent.VK_5) {
            N_5 = false;
        }
        if (code == KeyEvent.VK_6) {
            N_6 = false;
        }
        if (code == KeyEvent.VK_7) {
            N_7 = false;
        }
        if (code == KeyEvent.VK_8) {
            N_8 = false;
        }
        if (code == KeyEvent.VK_9) {
            N_9 = false;
        }
        if (code == KeyEvent.VK_0) {
            N_0 = false;
        }
    }
}
