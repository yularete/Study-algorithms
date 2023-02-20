package level1.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2562 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            //BufferedReader 은 기본 반환값이 문자이므로 반드시 Integer.parseInt()로 int 형으로 변환시켜준다.
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        int index = 0;

        int count = 0;

        for (int value : arr) {
            count++;
            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
