package interview.sphereIT.question1;

import java.util.Stack;

public class ReverseStringWithSpaces {
    public static void main(String[] args) {
        String input = "a bc def";
        String reversedString = reverseStringWithSpaces(input);
        System.out.println(reversedString);
    }

    public static String reverseStringWithSpaces(String input) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();

        // Push non-space characters onto the stack
        for (char c : charArray) {
            if (c != ' ') {
                stack.push(c);
            }
        }

        // Reconstruct the string with reversed characters and spaces
        StringBuilder reversedString = new StringBuilder();
        for (char c : charArray) {
            if (c == ' ') {
                reversedString.append(' '); // Add the space
            } else {
                reversedString.append(stack.pop()); // Pop and add characters
            }
        }

        return reversedString.toString();
    }
}
