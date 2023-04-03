// 08. 유효한 팰린드롬
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//알파벳 이외의 문자들의 무시합니다.

import java.util.*;
public class ValidPalindromeString {
    public String solution(String s){
        String answer="NO";
        // A-Z까지의 수가 아닌 문자는 ""공백으로 대처한다.
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        // StringBuilder의 문자열을 거꾸로 하는 reverse()함수를 실행
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }
    public static void main(String[] args){
        ValidPalindromeString T = new ValidPalindromeString();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}
