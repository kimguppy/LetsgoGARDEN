import java.io.*;
import java.util.Stack;

public class jun1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter result = new BufferedWriter(new OutputStreamWriter(System.out)); 바로바로 씀
        StringBuffer result = new StringBuffer();

        Stack<Integer> stackInt = new Stack<>();
        int N= Integer.parseInt(br.readLine());

        int A[] = new int[N];
        int P = 0;

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }//입력 받았음

        for(int i=1; i<=N; i++){
            stackInt.push(i);
            result.append("+\n"); // 출력
            while (!stackInt.isEmpty()){
                if(stackInt.peek()==A[P]){
                    stackInt.pop();
                    result.append("-\n");
                    P++;
                }else{break;}

                }
        }
        if(stackInt.isEmpty()){
            System.out.println(result);

        }else{System.out.println("NO");}

    }
}
