package sprout.loop;

import java.util.Scanner;

public class Loop301672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        int j = 1;
            for (i = 1;i <= 9; i++){
            System.out.println(N + " * " + i +" = " + (N * i));
        }
    }
}