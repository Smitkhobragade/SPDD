// package pracex;

public class main {
  public static void main(String[] args) {
    OnlineShoppingPortal s1 = new OnlineShoppingPortal();
    s1.value(100);
    s1.value(1000);
    s1.value(100, "GET10");
    s1.value(1001,"GET10");
    s1.value(100,"GET1001");
  }
}
