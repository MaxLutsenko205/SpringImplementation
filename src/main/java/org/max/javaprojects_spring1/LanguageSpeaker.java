package org.max.javaprojects_spring1;

import java.util.ArrayList;
import java.util.List;

public class LanguageSpeaker {
    private List<Language> languageList = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLanguageList(Language language) {
        languageList.add(language);
    }
    public LanguageSpeaker(){}
    // IoC (inversion of control)
    public LanguageSpeaker(List<Language> languageList) {
        this.languageList = languageList;
    }
    public void Speak() {
        for (Language language : languageList){
            System.out.println("-"+language.getWord());
        }

    }
}
