import java.util.Stack;

public class ReverseFromCharUsingStack {

    static String reverseUsingStack(String word) {

        int firstIndex = word.indexOf('i');
        if (firstIndex == -1) {
            return word;
        }

        int secondIndex = word.indexOf('i',firstIndex+1);
        if (secondIndex !=-1) {
            return word;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < firstIndex; i++) {
            stack.push(word.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder();

        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        stringBuilder.append(word.substring(firstIndex + 1));

    return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String input = "string";
        String input2 = "initial";

        System.out.println(reverseUsingStack(input));
        System.out.println(reverseUsingStack(input2));
    }
}
