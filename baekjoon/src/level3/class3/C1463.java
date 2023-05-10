package level3.class3;

import java.util.Scanner;

public class C1463 {

    static Integer[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(makeOne(N));
    }

    static int makeOne(int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(makeOne(N - 1), Math.min(makeOne(N / 3), makeOne(N / 2))) + 1;
            } else if (N % 3 == 0) {
                dp[N] = Math.min(makeOne(N / 3), makeOne(N - 1)) + 1;
            } else if (N % 2 == 0) {
                dp[N] = Math.min(makeOne(N / 2), makeOne(N - 1)) + 1;
            } else {
                dp[N] = makeOne(N - 1) + 1;
            }
        }
        return dp[N];
    }
}
