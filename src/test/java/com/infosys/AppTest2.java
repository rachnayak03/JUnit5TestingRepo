package com.infosys;

import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest2 {
    CalculatorUtil cu;
    @BeforeEach
//it will be executed before each of the testit is part of junit lifecycle
    void init(){
        System.out.println("Before every test");
        cu=new CalculatorUtil();
    }
    @Order(value=2)
    @Test
    void testAdd(){
        //CalculatorUtil cu= new CalculatorUtil();
        int actual=cu.add(10,20);
        int expected=30;
        Assertions.assertEquals(actual,expected);

    }
    @Order(value=1)
    @Test

    @DisplayName("Add Method Test")
    void testNullString(){
        //CalculatorUtil cu=new CalculatorUtil();
        //String input=NULL
        String input="hello";
        String res=cu.parseString(input);
        Assertions.assertNotNull(res);

    }
}
