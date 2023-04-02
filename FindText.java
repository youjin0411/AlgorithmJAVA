// 01. 문자찾기
// 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특수문자가,
// 입력받은 문자열에 몇개 존재하는지 알아내는 프로그램. 대소문자를 구분하지 않고 찾음.
import java.util.*;
public class FindText {
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x: str.toCharArray()){
            if(x == c) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        FindText T = new FindText();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
