package jichu;

import java.util.Stack;

public class Evaluate {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack<Character> opsStack = new Stack<Character>();
        Stack<Integer> valStack = new Stack<Integer>();
        String string = "(1+((2+3)*(4*5)))";
        char[] arr = string.toCharArray();
        for (char c : arr) {
            if (c == '(') {
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                opsStack.push(c);
            } else if (c == ')') {
                int v = valStack.pop();
                char char1 = opsStack.pop();

                if (char1 == '+') {
                    v = valStack.pop() + v;
                } else if (char1 == '-') {
                    v = valStack.pop() - v;
                } else if (char1 == '*') {
                    v = valStack.pop() * v;
                } else {
                    v = valStack.pop() / v;
                }
                valStack.push(v);
            } else {
                valStack.push(Integer.parseInt(String.valueOf(c)));
            }
        }
        System.out.println(valStack.pop());
    }

}
