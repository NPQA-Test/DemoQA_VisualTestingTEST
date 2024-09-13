package org.example;

import java.net.MalformedURLException;

import static org.example.ParallelCapsIOS.*;


public class parallelExeIOS {


    private static String ParallelCapsIOS;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        String userToken = "k6rq4nwrxba0lf01ge2rget15y7gl9ht";

        Runnable task1 = () -> {
            try {
                iosdevice1(ParallelCapsIOS, userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task2 = () -> {
            try {
                iosdevice2(ParallelCapsIOS, userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
/*        Runnable task3 = () -> {
            try {
                iosdevice3(ParallelCapsIOS, userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
            Runnable task4 = () -> {
            try {
                iosdevice4(ParallelCapsIOS, userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
*/
            Thread thread1 = new Thread(task1);
            thread1.start();

            Thread thread2 = new Thread(task2);
            thread2.start();

//            Thread thread3 = new Thread(task3);
//            thread3.start();

 //            Thread thread4 = new Thread(task4);
 //            thread4.start();
    }
}