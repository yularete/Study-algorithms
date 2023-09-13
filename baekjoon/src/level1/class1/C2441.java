package level1.class1;

import java.util.Scanner;

public class C2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j < num; j++) {
                System.out.println(" ");
            }
            for (int k = i; k < num; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
