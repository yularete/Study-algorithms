package level1.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C25314 {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int len = N/4;
        for (int i = 0; i<len; i++){
            sb.append("long ");
        } sb.append("int");
        System.out.println(sb);

    }
}
