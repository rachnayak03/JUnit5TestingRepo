package com.infosys;

import org.junit.jupiter.api.*;
//testinfo and testreporters are interfaces
@DisplayName("Test Reporter and Info demo")
public class TestInforAndReporterDemo {
    TestInfo testInfo;
    TestReporter testReporter;
    CalculatorUtil cu;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo=testInfo;
        this.testReporter=testReporter;
        cu=new CalculatorUtil();
        testReporter.publishEntry("Test class running"+testInfo.getTestClass()+"\n test running \t"+testInfo.getTestMethod() +"\n tags \t"+testInfo.getTags()+"\n display name \t"+testInfo.getDisplayName());

    }
    @Test
    @DisplayName("Testing add method")
    @Tag("add")
    void add(){
//        System.out.println(this.testInfo.getTestClass());
//        System.out.println(this.testInfo.getTestMethod());
//        System.out.println(this.testInfo.getTags());

        int actual=cu.add(10,20);
            int expected=30;
            Assertions.assertEquals(actual,expected);


    }
    @Test
    @DisplayName("Testing multiply method")

    void testMul(){
        //assertAll
        Assertions.assertAll(
                ()->Assertions.assertEquals(0,cu.mul(0,4)),
                ()->Assertions.assertEquals(-2,cu.mul(-2,1)),

                ()->Assertions.assertEquals(4,cu.mul(4,1))

        );

    }
    @Test
    void testDivException(){
        //CalculatorUtil cu=new CalculatorUtil();
        Assertions.assertThrows(ArithmeticException.class,()->cu.div(1,0));


    }
}
