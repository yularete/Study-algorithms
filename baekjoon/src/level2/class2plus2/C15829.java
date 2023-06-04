package level2.class2plus2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class C15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();
        BigInteger result = new BigInteger("0");

        for (int i = 0; i < L; i++) {
            result = result.add(BigInteger.valueOf(s.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
    }
}
