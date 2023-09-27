package level1.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("END")) break;
            StringBuilder reverse = new StringBuilder(s);
            reverse.reverse();
            sb.append(reverse).append("\n");
        }
        System.out.print(sb);
    }
}
