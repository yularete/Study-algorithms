package sprout.loop;

import java.util.Scanner;

public class loop2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        if (N <= 100000) {
            for (i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
