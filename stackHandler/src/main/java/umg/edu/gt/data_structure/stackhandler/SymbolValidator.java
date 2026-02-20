package umg.edu.gt.data_structure.stackhandler;

public class SymbolValidator {

    public static boolean validate(String expression) {
        Stack stack = new Stack();

        for (char c : expression.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;

                char open = stack.pop();

                if (!matches(open, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}