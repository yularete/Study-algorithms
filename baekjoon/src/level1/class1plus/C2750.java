package level1.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N= Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2001];

        for(int i = 0; i < N; i++){
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        for(int i =0 ; i <2001; i++){
            if(arr[i]){
                sb.append(i -1000).append('\n');
            }
        }
        System.out.println(sb);
    }
}
