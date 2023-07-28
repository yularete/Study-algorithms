package level1.class1plus;

import java.util.Arrays;
import java.util.Scanner;

public class C1427 {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        char[] arr = N.next().toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
