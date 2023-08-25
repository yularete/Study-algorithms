package level1.class1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class C10718 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("아하하하하");
        bw.newLine();
        bw.write("으하하하하");

        bw.flush();
        bw.close();
    }
}
