/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.weed.green;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author Darren H
 */
public class Sound {
    
    private AudioClip clip;
    
    public Sound(String filename) {
        try {
            clip = Applet.newAudioClip(Sound.class.getResource(filename));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void play() {
        try {
            new Thread() {
                public void run() {
                    clip.play();
                }
            }.start();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
