import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class jun1490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 재료
        int A[] = new int[N];
        int M = Integer.parseInt(br.readLine()); // 답

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++ ){
            A[i] = Integer.parseInt(st.nextToken()); // 숫자갯수
        }

        Arrays.sort(A);

        int count= 0;
        int start =0;
        int end = N-1;
        long sum;

        while (end > start ) {
            sum =A[start]+A[end];
            if (sum < M) {
                start++;
            } else if (sum == M ) {
                start++;
                end--;
                count++;
            } else if (sum > M) {
                end--;
            }
        }
        System.out.println(count);
    }
}
