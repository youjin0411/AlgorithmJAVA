//05. 특정 문자 뒤집기
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기
//자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
import java.util.*;
public class FlipSpecificCharacters {
    public String solution(String str){
        String answer = "";
        // 문자열을 char형 배열로 변환
        char[] s = str.toCharArray();
        // 왼쪽, 오른쪽의 각각 인덱스
        int left = 0, right = str.length()-1;
        while(left < right){
            //isAlphabetic은 알파벳인지 아닌지 참과 거짓
            if(!Character.isAlphabetic(s[left])) left++;
            else if(!Character.isAlphabetic(s[right])) right--;
            else {
                //알파벳이라면 인덱스 앞 뒤 변경
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                left++;
                right--;
            }
        }
        //char형을 문자형으로 강제 변형
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) {
        FlipSpecificCharacters S = new FlipSpecificCharacters();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(S.solution(str));
    }
}
