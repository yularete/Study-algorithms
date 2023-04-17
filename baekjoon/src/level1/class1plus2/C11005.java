package level1.class1plus2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class C11005 {
    private static int check(int a, int b){
        return a%b > 9 ? (a%b + 55) : (a%b + 48);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        StringTokenizer st =new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while(a > 0){
            stack.push((char)(check(a,b)));
            a /= b;
        }
        while (!stack.isEmpty())
            bw.write(stack.pop());

        bw.flush();
        bw.close();
        br.close();
    }
}
