import java.util.*;

public class Main {

    public static void main(String[] args) {
        String string1 = "aabaa";
        String string2 = "1100011";
        String string3 = "1100001";
        System.out.println(isPalindrome(string1));
        System.out.println(isPalindrome(string2));
        System.out.println(isPalindrome(string3));
    }

    public static boolean isPalindrome(String string) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<Character>();

        for(int i = 0; i< string.length(); i++){
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }

        while(!stack.isEmpty()){
            if (stack.pop() != queue.poll())
                return false;
        }
        return true;
    }
}