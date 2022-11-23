package sprout.conditionalStatements;

import java.util.Scanner;

public class Cs2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();
        if((-2000000000<=N)&&(M<=2000000000)){
            System.out.println(Math.abs(N-M));
        }
        sc.close();
    }
}
