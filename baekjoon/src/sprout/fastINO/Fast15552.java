package sprout.fastINO;

import java.io.*;

public class Fast15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i =1;
        int T = Integer.parseInt(br.readLine());
        while (i<=T){
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
         bw.write(A+B);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
