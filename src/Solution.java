import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String input = "abcdefg";
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.replace(0,input.length()-1,"ss"));
    }
}
