import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class jun1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        String[] subtractions = N.split("-");
        int[] sol = new int[subtractions.length];
        int result =0;

        for (int i = 0; i< subtractions.length ; i++) {
            String[] firstGroup = subtractions[i].split("\\+");
            for(String num : firstGroup){
                sol[i] += Integer.parseInt(num);
            }
        }
        result += sol[0];

        for (int i = 1; i < sol.length; i++) {
                result -= sol[i];
        }

        System.out.println(result);


    }

}

