package com.driver;
public class Main {
    class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    String meth(){
        super.meth();
        return "Method is overridden in Extendend class B";
    }

}
  public static void main(String[] args) {
    A o =new B();
    o.meth();
  }
}