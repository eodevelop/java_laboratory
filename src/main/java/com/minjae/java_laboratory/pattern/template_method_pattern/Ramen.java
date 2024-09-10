package com.minjae.java_laboratory.pattern.template_method_pattern;

public abstract class Ramen {

    public void CookRamen() {
        // 공통적인 뼈대 로직
        System.out.println("냄비를 꺼낸다.");
        System.out.println("물을 담는다.");
        System.out.println("불을 켠다.");
        System.out.println("물이 끓는다.");

        // 내부에서 구현될 상세 로직
        putRamen();

        // hook 연산
        putMyRecipe();
    }


    protected abstract void putRamen();

    // hook 연산
    protected void putMyRecipe() {
        // 정의만 하고 아무런 동작을 하지 않는다.
    }
}
