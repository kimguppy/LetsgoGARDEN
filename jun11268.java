import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class jun11268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 숫자 갯수
        StringBuffer result = new StringBuffer();
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)-> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if(first_abs==second_abs){
                return o1> o2 ? 1: -1;
            }
            return first_abs- second_abs; // 절댓값이 작은 데이터 우선
            //리턴하는 값(양수 음수)에 따라서 스왑을 하냐 안하냐
        });

        for(int i = 0; i<N; i++){
            int S=Integer.parseInt(br.readLine());
            if(S==0){
                if(myQueue.isEmpty()){
                    result.append("0\n");
                }else{
                    result.append(myQueue.poll()+"\n") ;
                }
            }else{
                myQueue.add(S);
            }

        }
        System.out.println(result);
        }
    }
