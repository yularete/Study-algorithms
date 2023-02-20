package level1.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {

            int cnt = 0; //연속횟수
            int sum = 0; //누적 합

            //getBytes()메소드는 입력 문자열을 byte 단위의 배열로 반환시켜주는 메소드
            //'배열'로 반환을 하므로 for-each문에서도 사용 가능
            for (byte value : br.readLine().getBytes()) {

                if (value == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
