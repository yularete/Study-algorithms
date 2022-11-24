package sprout.loop;

import java.util.Scanner;
public class Loop10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int A,B;

        while (true) {
            A = sc.nextInt();
            B = sc.nextInt();
            if((A==0)&&(B==0))
                break;
            if (((A > 0) && (A < 10)) && ((B > 0) && (B < 10))) {
                System.out.println(A + B);
            }
        }
        sc.close();
    }
}
