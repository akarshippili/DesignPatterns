package com.akarsh.designpatterns;

import java.util.concurrent.atomic.AtomicInteger;

public class Test4 {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(1);
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            // even
            int i = 2;
            while(i <= 10){
                synchronized (lock){
                    while (counter.get() % 2 == 1){
                        lock.notifyAll();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    i += 2;
                    counter.addAndGet(1);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            int i = 1;
            while(i < 10){
                synchronized (lock){
                    while (counter.get() % 2 == 0){
                        lock.notifyAll();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    i += 2;
                    counter.addAndGet(1);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}

//SELECT departmentName, count(*) as employee_count
//from EMPLOYEES
//GROUPBY departmentName
