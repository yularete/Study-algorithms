package level1.class1plus2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class C2745 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n.length(); i++) {
            stack.push(n.charAt(i));
        }
        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            int c = stack.pop();

            if (c >= 65) {
                c -= 55;
            } else {
                c -= 48;
            }
            for (int j = 0; j < i; j++) {
                c *= b;
            }
            num += c;
        }
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
