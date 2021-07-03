import java.util.ArrayList;

public class stackFromScratch {
  private ArrayList<Integer> arr = new ArrayList<>();

  public void push(int item) {
    arr.add(0, item);
  }

  public int pop() {
    return arr.remove(0);
  }

  public void display() {
    for (Integer integer : arr) {
      System.out.println(integer);
    }
  }

}
