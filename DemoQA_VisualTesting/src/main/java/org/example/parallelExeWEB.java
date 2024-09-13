package org.example;

import java.net.MalformedURLException;
import static org.example.ParallelCapsWEB.*;

public class parallelExeWEB {


    private static String ParallelCapsWEB;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        String userToken = "44oz73fb0yfuxn37r93686lmrfdnjnl9";
        Runnable task1 = () -> {
            try {
                browser1(ParallelCapsWEB, userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task2 = () -> {
            try {
                browser2(ParallelCapsWEB, userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable task3 = () -> {
            try {
                browser3(ParallelCapsWEB, userToken);
            } catch (MalformedURLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
//        Runnable task4 = () -> {
//            try {
//                browser4(ParallelCapsWEB, userToken);
//            } catch (MalformedURLException | InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//       };
//               Runnable task5 = () -> {
//            try {
//                browser5(ParallelCapsWEB, userToken);
//            } catch (MalformedURLException | InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        };
//         Runnable task6 = () -> {
//            try {
//                browser6(ParallelCapsWEB, userToken);
//            } catch (MalformedURLException | InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        };

          Thread thread1 = new Thread(task1);
          thread1.start();

          Thread thread2 = new Thread(task2);
          thread2.start();

          Thread thread3 = new Thread(task3);
          thread3.start();
//
//        Thread thread4 = new Thread(task4);
//       thread4.start();
//
////        Thread thread5 = new Thread(task5);
////        thread5.start();
//
//        Thread thread6 = new Thread(task6);
//        thread6.start();
       }

    }

