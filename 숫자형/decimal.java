package 숫자형;
/*
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
제한시간은 1초입니다.
*/
import java.util.*;
public class decimal {
    public int solution(int n){
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(n < 2) cnt++;
            for(int j = 2;  j * j <= n; j++){
                if(n % j != 0) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        decimal d = new decimal();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(d.solution(n));
    }
}
