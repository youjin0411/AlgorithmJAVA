//06. 중복 문자 제거
//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
import java.util.*;
public class RemoveDuplicateCharacters {
    public String solution(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            //indexOf는 입력으로 들어온 문자가 처음 등장하는 인덱스를 반환하는 메소드
            //즉, str.indexOf(str.charAt(i)가 배열의 위치 i와 같다면 그 문자는 중복되지 않은 문자
            // 만약 같지 않다면 중복된 문자이다.
            if(str.indexOf(str.charAt(i)) == i)  answer += str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        RemoveDuplicateCharacters T = new RemoveDuplicateCharacters();
        String str = "ksekkset";
        System.out.print(T.solution(str));
    }
}
