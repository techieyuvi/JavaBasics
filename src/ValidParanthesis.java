import java.util.Stack;

public class ValidParanthesis {

    static boolean isValid(String paranthesis) {

        Stack<Character> bracketStack = new Stack<Character>();

        for (int i = 0; i < paranthesis.length(); i++) {

            if (paranthesis.charAt(i) == '(' | paranthesis.charAt(i) == '{' | paranthesis.charAt(i) == '[') {
                bracketStack.push(paranthesis.charAt(i));
            } else {
                if (!bracketStack.empty() &&
                        ((bracketStack.peek() == '(' && paranthesis.charAt(i) == ')') ||
                                (bracketStack.peek() == '{' && paranthesis.charAt(i) == '}') ||
                                (bracketStack.peek() == '[' && paranthesis.charAt(i) == ']'))) {
                    bracketStack.pop();
                } else {
                    return false;
                }
            }
        }
        return bracketStack.empty();
//            if (bracketStack.empty()) {
//                return true;                      ?> this can also be used at the return statement,
//            } else {                                  but the one which is there right now is concise and readable.
//                return false;
//            }
    }

    public static void main(String[] args) {

        String input = "{[()}";

        System.out.println(isValid(input));
    }
}