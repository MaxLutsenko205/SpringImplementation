package org.max.javaprojects_spring1;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonMusicPlayerEx tom = SingletonMusicPlayerEx.getMusicPlayer("Classical Music");
        SingletonMusicPlayerEx mark = SingletonMusicPlayerEx.getMusicPlayer("Rock Music");

        System.out.println(tom.getSong());
        System.out.println(mark.getSong());

        tom.setSong("Jazz Music");

        System.out.println(tom.getSong());
        System.out.println(mark.getSong());
    }
}
