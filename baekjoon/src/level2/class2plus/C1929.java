package level2.class2plus;

import java.util.Scanner;

public class C1929 {
    public static boolean[] prime;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        prime = new boolean[N + 1];
        getPrime();

        for (int i = M; i <= N; i++) {
            if (!prime[i]) System.out.println(i);
        }
    }

    public static void getPrime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
