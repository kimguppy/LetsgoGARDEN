import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class jun2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 숫자 갯수

        int result[] = new int[N];
        for(int i= 0; i<N; i++){
            result[i] = Integer.parseInt(br.readLine()); // 숫자 갯수
        }
        Arrays.sort(result);

        for(int i : result){
            System.out.println(i);
        }
        }
    }
