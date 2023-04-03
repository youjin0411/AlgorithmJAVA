// 07.팰린드롬 문자열
// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
// 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
// 단 회문을 검사할 때 대소문자를 구분하지 않습니다.

import java.util.*;
public class PalindromeString {
    public boolean solution(String str){
        boolean ans = true;
        // 문자열을 모두 대문자로 변경
        str = str.toUpperCase();
        // str문자열을 char형 배열로 변경
        char[] s = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            // 앞 / 뒤에서부터 같지 않다면 false 리턴
            if(s[i] != s[str.length()-i-1]) ans = false;
        }
        return ans;
    }
    public static void main(String[] args){
        PalindromeString T = new PalindromeString();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
