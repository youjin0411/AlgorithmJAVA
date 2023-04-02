// 04. 단어 뒤집기
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
import java.lang.reflect.Array;
import java.util.*;
public class FlipTheWord {
    // ArrayList의 String형으로 리턴
    public ArrayList<String> solution(int n, String[] str){
        // ArrayList answer 선언
        ArrayList answer = new ArrayList<>();
        for(String s: str){
            // new StringBuilder()는 주로 문자열 관련 함수를 많이 제공함.
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args){
        FlipTheWord T = new FlipTheWord();
        Scanner kb = new Scanner(System.in);
        // 입력할 단어의 수
        int n=kb.nextInt();
        // 입력할 단어를 담을 배열
        String[] str=new String[n];
        // 입력한 단어의 수 만큼 반복
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
