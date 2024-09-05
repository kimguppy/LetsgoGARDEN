import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class jun11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int v[] = new int[N];

        for(int i =0; i<N ;i++){
            v[i]=Integer.parseInt(br.readLine());
        }
        int coin = 0;

        for(int i=N-1; i>=0; i--){
            int now = M%v[i];
            //남은 거

            if(now!=M){
                coin= coin + M/v[i];
                M=now;
            }else if(now==0){
                break;
            }
        }
        System.out.println(coin);


        }
}

