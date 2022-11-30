package sprout.fastINO;

import java.io.*;
import java.util.StringTokenizer;

public class Fast15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            //StringTokenizer() : 아무 값도 가지지 않는 부분이 나오면 무시하고 지나가서 깔끔하게 문자열 분리가 가능하다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write((num1 + num2)+"\n");
        }
        bw.flush();
        }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int i =1;
//        int T = Integer.parseInt(br.readLine());
//        while (i<=T){
//            int A = Integer.parseInt(br.readLine());
//            int B = Integer.parseInt(br.readLine());
//         bw.write(A+B);
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
    }
