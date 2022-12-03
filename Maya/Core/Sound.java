package Maya.Core;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    public static synchronized void playSound(final String url) {

        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(Window.class.getResourceAsStream("/"+url));
            clip.open(inputStream);
            clip.start(); 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
