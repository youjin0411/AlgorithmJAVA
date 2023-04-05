// 2-2. 보이는 학생
// 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로
//주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
//(어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않
//습니다.)
import java.util.*;
public class VisibleStudent {
    public int solution(int n, int[] arr){
        // 맨 앞의 학생은 무조건 보인다.
        int answer = 1;
        // 앞에서 제일 큰 학생을 계속 max 값을 변경하며 넣어야 비교가능
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        VisibleStudent S = new VisibleStudent();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(S.solution(n, arr));
    }
}
