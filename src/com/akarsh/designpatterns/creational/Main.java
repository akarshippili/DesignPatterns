package com.akarsh.designpatterns.creational;

public class Main {

    public static void singletonRun() {
//        Singleton singleton = new Singleton(); // Error
//        System.out.println(Singleton.getInstance());//        com.akarsh.designpatterns.creational.Singleton@5acf9800
//        System.out.println(Singleton.getInstance());//        com.akarsh.designpatterns.creational.Singleton@5acf9800

        Thread thread1 = new Thread(() -> {
            System.out.println(Singleton.getInstance());
        });
        Thread thread2 = new Thread(() -> {
            System.out.println(Singleton.getInstance());
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        singletonRun();
    }
}
