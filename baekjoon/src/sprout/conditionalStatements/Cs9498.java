package sprout.conditionalStatements;

import java.util.Scanner;

public class Cs9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A <=100 && A>=90){
            System.out.println("A");
        } else if (90>A && A>=80) {
            System.out.println("B");
        } else if (80>A && A>=70) {
            System.out.println("C");
        } else if (70>A && A>=60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
