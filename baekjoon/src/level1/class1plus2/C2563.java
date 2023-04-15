package level1.class1plus2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rangeOfBlack = 0;
        int numOfPaper = Integer.parseInt(br.readLine());
        boolean[][] sheet = new boolean[101][101];

        for(int i = 0; i<numOfPaper; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j< x+10; j++){
                for(int k = y; k < y+10; k++){
                    if(!sheet[j][k]){
                        sheet[j][k] = true;
                        rangeOfBlack++;
                    }
                }
            }
        }
        System.out.println(rangeOfBlack);
    }
}
