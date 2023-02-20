package level1.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C2920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //배열 선언
        int arr[] = new int[8];

        String str = "";

        st = new StringTokenizer(br.readLine());
        //배열에 값 저장
        for(int i = 0; i < 8; i++){
            //토큰은 분리된 문자열 조각으로, StringTokenizer는 하나의 문자열을 여러 개의 토근으로 분리하는 클래스
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < arr.length -1; i++){
            //오름차순일 경우
            if(arr[i+1] == arr[i] +1)
                str = "ascending";
            //내림차순일 경우
            else if(arr[i+1] == arr[i] - 1)
                str = "descending";
            else {
                str = "mixed";
                break;
            }
        }
        System.out.println(str);
    }
}
