import java.util.Scanner;

public class jun1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 숫자가 별로 없으니까 스캐너 쓰자
        int N = sc.nextInt(); // 점수 갯수
        int A;

        double sum = 0;
        double max = 0;

        for(int i=0; i<N; i++){
            A = sc.nextInt();

            if(max<A) max = A;
            sum+= A;
        }

        double result = sum*100/max/ N;

        System.out.println(result);
    }
}
