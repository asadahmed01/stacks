
public class Main {
  public static void main(String[] args) {
    // String input = "({}{1323)";
    // var stack = new Stacks();
    // // stack.stringBalance(input);
    // System.out.println(stack.stringBalance(input));

    var stack = new stackFromScratch();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    // stack.display();
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

  }

}