import java.util.Stack;

public class MultiBracketValidation {


    public boolean validateBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        char[] inputString = input.toCharArray();
        for (char ch : inputString) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else if ( (ch == ')' && stack.peek() == '(')
                        ||  (ch == ']' && stack.peek() == '[')
                        ||  (ch == '}' && stack.peek() == '{') ) {
                    stack.pop();
                }
            }
        }
        return (stack.isEmpty());
    }

}

