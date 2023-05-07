package level2.class2plus2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C10989 {
    public static void main(String[] args) throws IOException {
       //개수의 범위는 1~10000
        int[] cnt = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            //해당 인덱스에 1+
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        //입력범위는 1부터 시작
        for(int i = 1; i < 10001; i++){
            while (cnt[i]>0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
