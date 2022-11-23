package sprout.loop;

import java.util.Scanner;

public class loop10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;
        int i;

        if (0 <= N && N<= 12) {
            for (i = 1; i <= N; i++) {
                sum *= i;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
