package level1.class1plus2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumOfSubject = 0;
        double sumOfAvg = 0.0;

        for(int i = 0; i <20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(!grade.equals("P")){
                sumOfSubject += credit;
                switch (grade){
                    case "A+":
                        sumOfAvg += 4.5 *credit;
                        break;
                    case "A0":
                        sumOfAvg += 4.0 *credit;
                        break;
                    case "B+":
                        sumOfAvg += 3.5 *credit;
                        break;
                    case "B0":
                        sumOfAvg += 3.0 *credit;
                        break;
                    case "C+":
                        sumOfAvg += 2.5 *credit;
                        break;
                    case "C0":
                        sumOfAvg += 2.0 *credit;
                        break;
                    case "D+":
                        sumOfAvg += 1.5 *credit;
                        break;
                    case "D0":
                        sumOfAvg += credit;
                        break;
                    case "F":
                        sumOfAvg += 0.0;
                        break;
                }
            }
        }
        double avg = sumOfAvg / sumOfSubject;
        System.out.println(avg);
    }
}
