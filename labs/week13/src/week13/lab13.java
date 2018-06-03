package week13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class lab13 extends Thread {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static long time = 0;
    public void run() {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Comands().mean(lab13.list));
        System.out.println("First thread duration: " + ( System.currentTimeMillis() - start));
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10000; i++){
            list.add(i);
        }
         time = scanner.nextLong();
        TimeChecker tc = new TimeChecker();
        lab13 l = new lab13();
        l.start();
        tc.start();
        AnotherThread at = new AnotherThread();
        at.start();
        (new ThirdThread()).start();
    }
}
