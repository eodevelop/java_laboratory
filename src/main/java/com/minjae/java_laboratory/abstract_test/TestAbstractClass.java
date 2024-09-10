package com.minjae.java_laboratory.abstract_test;

public abstract class TestAbstractClass {
    abstract void testMethod();
    public void testMethod2() {
        try {
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("true = " + true);
        }
    }
}

