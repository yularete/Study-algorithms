package sprout.loop;

import java.util.Scanner;

public class Loop10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
        /*나의 코드 ^^....*/
//        Scanner sc = new Scanner(System.in);
//        int A, B = 1;
//
//        while (true) {
//            A = sc.nextInt();
//            B = sc.nextInt();
//            if (((0 > A) && (0 > B)) || ((A > 10) && (B > 10)))
//                break;
//            if (((0 < A) && (0 < B)) && ((A < 10) && (B < 10))) {
//                System.out.println(A + B);
//            }
//
//        }sc.close();
    }
}
