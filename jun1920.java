import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class jun1920 {
    static int N,M;
    static int v[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        v = new int[N];

        for(int i= 0; i < N ; i++){
            v[i]= Integer.parseInt(st.nextToken());

        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Arrays.sort(v);

        int check;
        boolean find;

        for(int i= 0; i <M; i++){
            find = false;
            check = Integer.parseInt(st.nextToken());
            int start = 0;
            int end= N-1;

            while (start <=end){
                int middle = (start+end)/2;
                if(v[middle] > check){
                    end = middle-1;
                }else if(v[middle] < check){
                    start = middle+1;
                }else{
                    find= true;
                    break;

                }
            }

            if(find){
                System.out.println("1");
            }else {System.out.println("0"); }
        }
       

        }
        

}

