package org.max.javaprojects_spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        LanguageSpeaker languageSpeaker1 = context.getBean("languageSpeakerBean", LanguageSpeaker.class);
        LanguageSpeaker languageSpeaker2 = context.getBean("languageSpeakerBean", LanguageSpeaker.class);

        System.out.print(languageSpeaker1.getName()+": ");
        languageSpeaker1.Speak();

        System.out.print(languageSpeaker2.getName()+": ");
        languageSpeaker2.Speak();

        languageSpeaker1.setName("Martin");
        languageSpeaker1.setLanguage(new GermanLanguage());

        System.out.print(languageSpeaker1.getName()+": ");
        languageSpeaker1.Speak();

        System.out.print(languageSpeaker2.getName()+": ");
        languageSpeaker2.Speak();

        context.close();
    }
}
