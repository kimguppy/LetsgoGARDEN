import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class jun12892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 명수
        int d = Integer.parseInt(st.nextToken()); // 차이
        int A[][] = new int[N][2];

        for(int i = 0; i < N ; i++ ){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j < 2; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }// 숫자갯수
        }
        Arrays.sort(A, Comparator.comparingInt(o -> o[0]));


        int start =0;
        int end = 0;
        long heart = 0;
        long max = 0;

        while (end < N ) {

            if(A[end][0]-A[start][0]< d) {
                heart += A[end++][1];
            }else heart -= A[start++][1];

            if (max < heart) max = heart;
        }
        System.out.println(max);
    }
}
