package com.minjae.java_laboratory.pattern.template_method_pattern;

public class RamenMain {
    public static void main(String[] args) {
        System.out.println("=====================================");
        Ramen shinRamen = new ShinRamen();
        shinRamen.CookRamen();

        System.out.println("=====================================");
        Ramen anseongtangmyeon = new Anseongtangmyeon();
        anseongtangmyeon.CookRamen();
    }
}
