import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jun12891 {

    public static int N;
    public static char A[];
    public static int Check[]= new int[4];
    public static int Check2[] =new int[4];
    public static int M;
    public static String J;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //문자열 길이
        A =  new char[N];
        M = Integer.parseInt(st.nextToken()); // 비번 문자열 길이

        J = br.readLine(); // 2번째 줄
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4 ; i++ ) { // 3번쨰 줄
            Check[i] = Integer.parseInt(st.nextToken());
        }

        int count= 0;
        int nocount= 0;
        int start =0;
        int end =0;

        //초기 세팅
        while (M > end) {
            char DNA = J.charAt(end);
            Classfiy(DNA);

            end++;
        }

        for(int i = 0; i < 4 ; i++ ) { // 3번쨰 줄
            if(Check[i]  > Check2[i]) break;
            nocount++;
        }
        if (nocount ==4) count++;
        nocount=0;


        // 앞 으로

        while (N > end) {
            NClassfiy(J.charAt(start));
            char DNA = J.charAt(end);
            Classfiy(DNA);

            for(int i = 0; i < 4 ; i++ ) { // 3번쨰 줄
                if(Check[i] > Check2[i]) break;
                nocount++;
            }
            if (nocount ==4) count++;
            nocount=0;
            end++;
            start++;
        }

        System.out.println(count);
    }

    private static void Classfiy(char DNA){
            switch(DNA) {
                case 'A': Check2[0]++;
                    break;
                case 'C': Check2[1]++;
                    break;
                case'G':Check2[2]++;
                    break;
                case'T': Check2[3]++;
                    break;
                default :
            }
    }

    private static void NClassfiy(char DNA){
            switch(DNA) {
                case 'A': Check2[0]--;
                    break;
                case 'C': Check2[1]--;
                    break;
                case'G':Check2[2]--;
                    break;
                case'T': Check2[3]--;
                    break;
                default :
        }
    }
}


