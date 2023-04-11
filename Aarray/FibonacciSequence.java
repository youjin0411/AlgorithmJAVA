package Aarray;
/*
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 */
import java.util.*;
public class FibonacciSequence {
    public int[] solution(int n){
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 1;
        for(int i = 2; i < n; i++){
            ans[i] = ans[i-2] + ans[i-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        FibonacciSequence f = new FibonacciSequence();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(f.solution(n));
    }
}
