package org.max.javaprojects_spring1;

import java.util.ArrayList;
import java.util.List;

public class LanguageSpeaker {
    private Language language;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLanguage(Language language) {this.language = language;}

    // IoC (inversion of control)
    public LanguageSpeaker(Language language){
        this.language = language;
    }
    public LanguageSpeaker(){}
    public void Speak() {
        System.out.println(language.getWord());
    }
}
