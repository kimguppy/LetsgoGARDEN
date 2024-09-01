import java.util.Scanner;

public class jun11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 숫자가 별로 없으니까 스캐너 쓰자
        int N = sc.nextInt();
        String sNum = sc.next();
        int sum = 0;
        for(int i =0; i < N; i++){
            sum += sNum.charAt(i) - '0'; // 아스키 코드 빼서 숫자로 만듦
        }
        System.out.println(sum);
    }
}
