package sprout.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length() - 1) + "\n");
        }
        System.out.print(sb);
    }
}
