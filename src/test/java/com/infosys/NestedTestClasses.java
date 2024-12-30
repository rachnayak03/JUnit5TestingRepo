package com.infosys;

import org.junit.jupiter.api.*;
@DisplayName("Nested Test")
public class NestedTestClasses
{
    CalculatorUtil cu;

    @BeforeEach
    void init(){
        cu=new CalculatorUtil();
        }
        @Nested //nested test class //assert all does not give which test fails and which passes so using nested class we can view which test fails and which does not
        class AdditionTest{

            @Test
            @DisplayName("Addition Test for Positive Values")
            void addTest_Positive()
            {
                int actual=cu.add(10,20);
                int expected=30;
                Assertions.assertEquals(actual,expected);

            }
            @Test
            @DisplayName("Addition Test for Negative Values")
            void addTest_Negative(){
                int actual=cu.add(-10,-20);
                int expected=-40;
                Assertions.assertEquals(actual,expected);

            }
        }

    @Test
    @DisplayName("Assert all in multiple test")

    void testMul(){
        //assertAll
        Assertions.assertAll(
                ()->Assertions.assertEquals(0,cu.mul(0,4)),
                ()->Assertions.assertEquals(-2,cu.mul(-2,1)),

                ()->Assertions.assertEquals(4,cu.mul(4,1))

        );

    }


}
