import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 2-1 큰 수 출력하기
//N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을
// 작성하세요.(첫 번째 수는 무조건 출력한다.)
public class MaxFindPring {
    public ArrayList<Integer> solution(int n, int[] arr){
        // 동적으로 배열을 생성할 수 있는 ArrayList이다.
        ArrayList<Integer> answer = new ArrayList<>();
        // 첫번째 문자는 무조건 출력됨으로 arr[0]의 값을 answer에 넣어준다.
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            // 이전 값보다 그 다음값이 큰 값들을 answer에 넣어준다.
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args){
        MaxFindPring T = new MaxFindPring();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
