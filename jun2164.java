import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class jun2164 {
    public static void main(String[] args) throws IOException {
        Scanner sc=  new Scanner(System.in);
        int c = sc.nextInt();// int 형 입력 및 리턴
        int F = 0;

        ArrayDeque<Integer> card = new ArrayDeque<>();
        for(int i=1; i<=c ;i++){
            card.add(i);
        }

        while(!card.isEmpty()){
            F = card.pop();
            if(card.isEmpty()) break;
            F = card.pop();
            card.add(F);
        }

        System.out.println(F);
    }
}
