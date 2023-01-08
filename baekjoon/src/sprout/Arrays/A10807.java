package sprout.Arrays;

import java.util.Scanner;

public class A10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();
        int[] array = new int[N];
        int count=0;

        for(int i= 0; i<N; i++){
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int j : array) {
            if (v == j) {
                count++;
            }
        }
        System.out.print(count);
    }
}
