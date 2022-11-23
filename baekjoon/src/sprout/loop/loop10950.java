package sprout.loop;

import java.util.Scanner;

public class loop10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int T = sc.nextInt();
        int A,B;

        for (i=1;i<=T;i++){
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
    sc.close();
    }
}
