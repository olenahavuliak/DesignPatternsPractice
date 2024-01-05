package org.practice.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;
    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            return instance = new Singleton(value);
        } else
            return instance;
    }
}
