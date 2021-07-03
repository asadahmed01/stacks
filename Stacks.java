import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stacks {
  Stack<Character> stack = new Stack<>();
  private List<Character> leftBracket = Arrays.asList('(', '{', '[', '<');
  private List<Character> rightBracket = Arrays.asList(')', '}', ']', '>');

  public String reversSentence(String input) {
    for (char character : input.toCharArray()) {
      stack.push(character);
    }

    StringBuffer reversed = new StringBuffer();
    while (!stack.isEmpty()) {
      reversed.append(stack.pop());
    }

    return reversed.toString();
  }

  public boolean stringBalance(String input) {
    Stack<Character> stack = new Stack<>();
    for (Character ch : input.toCharArray()) {
      {
        if (leftBracket.contains(ch))
          stack.push(ch);
        if (rightBracket.contains(ch)) {
          if (stack.empty())
            return false;
          var openingBracket = stack.pop();
          if (ch == ')' && openingBracket != '(' || ch == '}' && openingBracket != '{'
              || ch == ']' && openingBracket != '[' || ch == '>' && openingBracket != '<')
            return false;

          // stack.pop();
        }

      }
    }
    return stack.empty();
  }

} // end of the class
