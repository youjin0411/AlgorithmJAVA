package 문자열;// 02. 대소문자 변환
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
// 변환하여 출력하는 프로그램을 작성하세요.
import java.util.*;
public class CaseConversion {
    public String solution(String str){
        String answer = "";
        //toCharArray()는 문자열을 char형 배열로 변환
        for(char x: str.toCharArray()){
            // isLowerCase/isUpperCase는 소문자인지/대문자인지 참 거짓 판별
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toUpperCase(x);
        }
        return answer;
    }
//public String solution(String str){
//    String answer="";
//    for(char x : str.toCharArray()){
//        if(x>=97 && x<=122) answer+=(char)(x-32); //문자 - 32는 대문자
//        else answer+=(char)(x+32); //문자 + 32는 소문자
//    }
//    return answer;
//}
    public static void main(String[] args){
        CaseConversion T = new CaseConversion();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
