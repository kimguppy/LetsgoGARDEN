import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jun11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 숫자 갯수
        int Q = Integer.parseInt(stringTokenizer.nextToken()); // 질문 갯수

        int A[] = new int[N+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=1; i<=N; i++) {
            A[i] = A[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        while(Q!=0){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(A[e]- A[s-1]);

            Q--;
        }

    }
}
