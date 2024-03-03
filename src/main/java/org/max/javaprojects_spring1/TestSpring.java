package org.max.javaprojects_spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        LanguageSpeaker languageSpeaker = context.getBean("languageSpeakerBean", LanguageSpeaker.class);
        System.out.println(languageSpeaker.getName());
        languageSpeaker.Speak();
        context.close();
    }
}
