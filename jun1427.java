import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class jun1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int result[] = new int[N.length()];

        for(int i= 0; i < N.length(); i++){
            result[i] = Integer.parseInt(N.charAt(i)+"");
        }
        Arrays.sort(result);

        for(int i = N.length()-1; i>=0 ;i--){
            System.out.print(result[i]);
        }
        }
    }
