package level1.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        // N
        Long N = Long.parseLong(br.readLine());

        // n*(n-1)*(n-2)번 돈다.
        str.append(N * (N - 1) * (N - 2) / 6).append("\n");
        // 다항식 : n*(n-1)*(n-2)/6
        str.append(3).append("\n");

        System.out.print(str);
        br.close();
    }
}
