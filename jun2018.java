import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jun2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 숫자갯수

        int count= 0;
        int start =1;
        int end = 0;
        long sum =1;

        while (end != N ) {
            if (sum < N) {
                sum += ++start;
            } else if (sum == N) {
                count++;
                sum += ++start;
                sum -= ++end;
            } else if (sum > N) {
                sum -= ++end;
            }
        }
        System.out.println(count);
    }
}
