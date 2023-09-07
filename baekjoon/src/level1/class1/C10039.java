package level1.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class C10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int val = Integer.parseInt(br.readLine());

            sum += Math.max(val, 40);
        }
        System.out.println(sum / 5);
    }
}
