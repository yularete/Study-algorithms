package sprout.loop;

import java.util.Scanner;

public class Loop2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j;
        if ((1 <= N) && (N <= 100)) {
            for (j = 1; j <= N; j++) {
                for (i = 1; i <=j; i++) {

                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

