package level1.class1plus2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());

        String str = String.valueOf(val);

        for (int i = 0; i <str.length(); i++){
            arr[(str.charAt(i) - 48)]++;
        }

        for (int v : arr){
            System.out.println(v);
        }

    }
}
