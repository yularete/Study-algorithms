package level1.class1plus2;

import java.io.IOException;

public class C1152 {
    public static void main(String[] args) throws IOException {

        int count = 0;
        int pre_str = 32; //공백을 의미
        int str;

        while (true) {
            str = System.in.read();

            //입력받은 문자가 공백일 때
            if (str == 32) {
                //이전의 문자가 공백이 아니라면
                if (pre_str != 32) count++;
            }
            // 입력받은 문자가 개행문자일 때('\n')
            else if (str == 10) {
                // 이전의 문자가 공백이 아니면
                if (pre_str != 32) count++;
                break;
            }
            pre_str = str;
        }
        System.out.println(count);
    }
}
