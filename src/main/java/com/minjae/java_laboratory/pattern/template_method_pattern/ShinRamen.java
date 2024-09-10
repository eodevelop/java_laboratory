package com.minjae.java_laboratory.pattern.template_method_pattern;

public class ShinRamen extends Ramen {
    @Override
    protected void putRamen() {
        System.out.println("신라면을 넣는다.");
    }
}
