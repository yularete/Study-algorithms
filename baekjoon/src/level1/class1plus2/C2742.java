package level1.class1plus2;

import java.io.*;

public class C2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        while (N > 0) {
            bw.write(N + "\n");
            N--;
        }
        bw.flush();
        bw.close();
    }
}
