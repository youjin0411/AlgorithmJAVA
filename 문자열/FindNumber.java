package 문자열;// 09. 숫자만 추출
//문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

import java.util.*;
public class FindNumber {
    public int solution(String str){
        int num = 0;
        String s = "";
        char[] c = str.toCharArray();
        for(char x : c){
            if(!Character.isAlphabetic(x)){
                s += x;
            }
        }
        num = Integer.parseInt(s);
        return num;
    }
    public static void main(String[] args){
        FindNumber T = new FindNumber();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
