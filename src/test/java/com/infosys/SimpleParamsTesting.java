package com.infosys;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParamsTesting {
    CalculatorUtil cu;
    @BeforeEach
    void init(){
        cu=new CalculatorUtil();
    }

    @ParameterizedTest
    @ValueSource(ints={10,19,18,31,22})
    @DisplayName("Even test case")
    void isEvenTest(int number){
        assertTrue(cu.isEven(number));

    }
    @ParameterizedTest
    @NullSource//supply null value to the source code
    void checkNull(String value){
        assertEquals(null,value);

    }

    @ParameterizedTest
    @EmptySource //supply empty value to the source
    void checkEmptyValue(String value){
        assertEquals("",value);
    }

    @ParameterizedTest
    @NullAndEmptySource //combine null and empty
    void checkNullAndEmpty(String value){
        assertTrue(value==null || value.isEmpty());
    }


}
