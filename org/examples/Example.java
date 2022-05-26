package org.examples;

public class Example {
  private int a, b;

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  public void m(int x) {
    if (x > a) {
      a = 0;
    } else {
      a = -1;
    }
    
    if (x < b) {
      b = 0;
    } else {
      b = 1;
    }
  }
}

