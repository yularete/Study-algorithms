package level1.class1;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String sentence = br.readLine().toUpperCase();//대문자로 변경해 입력받은 값 저장
            int NumOfVowel = 0;

            if (sentence.equals("#")) break;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'A' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U')
                    NumOfVowel++;
            }
            System.out.println(NumOfVowel);
        }
    }
}
