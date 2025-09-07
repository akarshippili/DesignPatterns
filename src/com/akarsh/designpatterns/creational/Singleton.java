package com.akarsh.designpatterns.creational;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

//    not thread safe
//    public static Singleton getInstance(){
//        if(instance==null) instance = new Singleton();
//        return Singleton.instance;
//    }

//    thread safe but performance ↓
//    public static synchronized Singleton getInstance(){
//        if(instance==null) instance = new Singleton();
//        return Singleton.instance;
//    }

    // Double-checked locking
    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) instance = new Singleton();
            }
        }

        return Singleton.instance;
    }

}
