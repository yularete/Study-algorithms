package level1.class1;

import java.util.Scanner;

public class C5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fir = sc.nextInt();
        int scd = sc.nextInt();
        int thr = sc.nextInt();
        int frt = sc.nextInt();

        int sum = (fir + scd + thr + frt);
        int min = sum / 60;
        int sec = sum - (min * 60);

        System.out.println(min + "\n" + sec);
    }
}
