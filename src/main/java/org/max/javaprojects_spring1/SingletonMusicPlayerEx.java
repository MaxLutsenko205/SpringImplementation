package org.max.javaprojects_spring1;

// in this example I wanna try singleton pattern creating one music player for setting music by many people
public class SingletonMusicPlayerEx {

    // single private object
    private static SingletonMusicPlayerEx musicPlayer;
    // any variable
    private String song;

    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }

    // private constructor so users cant create another objects
    private SingletonMusicPlayerEx(String song){
        this.song = song;
    }

    // creating object first time
    public static SingletonMusicPlayerEx getMusicPlayer(String song) {
        if (musicPlayer == null){
            musicPlayer = new SingletonMusicPlayerEx(song);
        }
        // if it was creating just returning already existing object
        return musicPlayer;
    }
}
