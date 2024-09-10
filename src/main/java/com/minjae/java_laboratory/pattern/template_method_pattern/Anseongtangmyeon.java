package com.minjae.java_laboratory.pattern.template_method_pattern;

public class Anseongtangmyeon extends Ramen {
    @Override
    protected void putRamen() {
        System.out.println("안성탕면을 넣는다.");
    }

    @Override
    protected void putMyRecipe() {
        System.out.println("안성탕면은 계란을 넣어야 맛있다!");
        System.out.println("계란을 넣는다.");
    }
}
