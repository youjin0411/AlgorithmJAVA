//03. 문장 속 단어
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//문장속의 각 단어는 공백으로 구분됩니다
import java.util.*;
public class WordsInSentence {
    public String solution(String str){
        String answer = "";
        String word[] = str.split(" ");
        for(String len : word){
            if(answer.length() <= len.length()) answer = len;
        }
        return answer;
    }
    public static void main(String args[]){
        WordsInSentence S = new WordsInSentence();
        String str = "it is time to JAVASTUDY";
        System.out.print(S.solution(str));
    }
}
