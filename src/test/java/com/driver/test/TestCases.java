package com.driver.test;
import com.driver.*;
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
            super.meth();
            return "Method is overridden in Extendend class B";
        }
    
    }
}
