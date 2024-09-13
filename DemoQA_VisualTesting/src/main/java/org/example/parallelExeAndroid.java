package org.example;

import java.net.MalformedURLException;
import static org.example.ParallelCapsAndroid.*;

public class parallelExeAndroid {

    public static void main() throws MalformedURLException, InterruptedException {

        String userToken = "k6rq4nwrxba0lf01ge2rget15y7gl9ht";
        Runnable task1 = () -> {
            try {
                android1(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task2 = () -> {
            try {
                android2(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task3 = () -> {
            try {
                android3(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task4 = () -> {
            try {
                android4(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable task5 = () -> {
            try {
                android5(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task6 = () -> {
            try {
                android6(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task7 = () -> {
            try {
                android7(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
       Runnable task8 = () -> {
            try {
                android8(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task9 = () -> {
            try {
                android9(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task10 = () -> {
            try {
                android10(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task11 = () -> {
            try {
                android11(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task12 = () -> {
            try {
                android12(userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();

        Thread thread3 = new Thread(task3);
        thread3.start();

        Thread thread4 = new Thread(task4);
        thread4.start();

        Thread thread5 = new Thread(task5);
        thread5.start();

        Thread thread6 = new Thread(task6);
        thread6.start();

        Thread thread7 = new Thread(task7);
        thread7.start();

        Thread thread8 = new Thread(task8);
        thread8.start();

        Thread thread9 = new Thread(task9);
        thread9.start();

        Thread thread10 = new Thread(task10);
        thread10.start();

        Thread thread11 = new Thread(task11);
        thread11.start();

        Thread thread12 = new Thread(task12);
        thread12.start();
         }

    }
