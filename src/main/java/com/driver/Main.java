package com.driver;
import com.driver.test.*;
public class Main {
    class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    
    class B extends A{
        @Override
        String meth(){
            return  "Method is overridden in Extendend class B";
        }
    
    }
  public static void main(String[] args) {
   B b=new B();
   System.out.println(b.meth());
  }
}
