package level1.class1;

import java.util.Scanner;

public class C11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            System.out.println(c);
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
