package org.practice.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello");
        Singleton anotherSingleton = Singleton.getInstance("Hi");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
