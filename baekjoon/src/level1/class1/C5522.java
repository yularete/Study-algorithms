package level1.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        for (int i = 0; i <= 5; i++) {
            total += Integer.parseInt(br.readLine());
        }
        System.out.println(total);
    }
}
