
public class stack {
  
  int l;
  int a[];
  int top=-1;

  stack(int l){
    this.l = l;
    this.a = new int[l];
  }

  int isEmpty(){
    if(top==-1){
      return 1;
    }
    return 0;
  }
  int isFull(){
    if(top >= (this.l-1)){
      return 1;
    }
    return 0;
  }

  void push(int x){
    if(isFull() == 0){
      this.a[top+1] = x;
      top++;
    }
    else
      System.out.println("STACK OVERFLOW ");
  }

  void peek(){
    if(isEmpty() == 0){
      System.out.println("AT TOP : "+ this.a[top]);
    }
    else
      System.out.println("STACK UNDERFLOW ");
  }

  int pop(){
    if(isEmpty() == 0){
    System.out.println("POPPED : "+ this.a[top]);
    int del = this.a[top];
    top--;
    return del;
  }
  else
    System.out.println("STACK UNDERFLOW");
    return 0;
}

}
