package level2.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();
            boolean check = true;

            if(str.equals("0")) break;

            for(int i = 0; i <str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length() -1 -i)) check = false;
            }
            if (check) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
