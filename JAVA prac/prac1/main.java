

public class main {

  public static void main(String[] args) {

    stack s1 = new stack(10);

    s1.push(4);
    s1.peek();
    s1.push(5);
    s1.push(2);
    s1.peek();
    s1.pop();
    s1.peek();
    s1.pop();
    s1.pop();
    s1.pop();

  }
  
}
