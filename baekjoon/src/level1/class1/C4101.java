package level1.class1;

import java.util.Scanner;

public class C4101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt(), b = in.nextInt();
            if (a == 0 && b == 0)
                break;
            if (a > b)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
