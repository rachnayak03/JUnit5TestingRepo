package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    void testDivException(){
        CalculatorUtil cu=new CalculatorUtil();
        Assertions.assertThrows(ArithmeticException.class,()->cu.div(1,0));


    }
}
