package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    void testAdd(){
        CalculatorUtil cu= new CalculatorUtil();
        int actual=cu.add(10,20);
        int expected=30;
        Assertions.assertEquals(actual,expected);

    }

}
