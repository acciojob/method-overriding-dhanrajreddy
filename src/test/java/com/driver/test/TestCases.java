package com.driver.test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    
    class B extends A{
        String meth(){
            return  "Method is overridden in Extendend class B";
        }
    
    }
    public static void main(String[] args) {
        A a= new B();
        System.out.println(b.meth());
    }
}
