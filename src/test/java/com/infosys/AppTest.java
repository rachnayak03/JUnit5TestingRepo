package com.infosys;


import org.junit.jupiter.api.*;
/**
 * Unit test for simple App.
 */
//By default for each test case there will be diff instances
//    if i have n test cases then n instances of test class will be created
// all instances creation will be handled by junit
// all test cases run parallelly
/**
 * Unit test for simple App.
 */
public class AppTest {

    CalculatorUtil cu;
     //for beforeall methods should be static
    //because beforeall get memory even before instance creation
     @BeforeAll
static void beforeAllInit(){
    System.out.println("Before all is executed");
}

    @BeforeEach//it will be executed before each of the testit is part of junit lifecycle
    void init(){
    System.out.println("Before every test");
    cu=new CalculatorUtil();
}
@AfterEach
void cleanCode(){
        System.out.println("Cleaning code");
}
    @Test
    void testShow()
    {
        System.out.println("hello");
    }

    @Test
    void testAdd(){
        //CalculatorUtil cu= new CalculatorUtil();
        int actual=cu.add(10,20);
        int expected=30;
        Assertions.assertEquals(actual,expected);

    }

    @Test
    @Disabled//this will not be executed. The test will be skipped
    void testFail()
    {

        Assertions.fail("This test is always going to be failed");
    }
    @Test
    @DisplayName("Add Method Test")
    void testNullString(){
        //CalculatorUtil cu=new CalculatorUtil();
        //String input=NULL
        String input="hello";
        String res=cu.parseString(input);
        Assertions.assertNotNull(res);

    }

    @Test
    @DisplayName("Comparing two objects")
    void testCompareObject(){
        String s1="Hi";
        String s2="Hi";
        String s3=new String("Hi");
        Assertions.assertSame(s1,s3);
    }
    @Test
    void testDivException(){
        //CalculatorUtil cu=new CalculatorUtil();
        Assertions.assertThrows(ArithmeticException.class,()->cu.div(1,0));


    }
    @Test
    void testException(){
        //CalculatorUtil cu=new CalculatorUtil();
        Assertions.assertDoesNotThrow(()->cu.div(1,1),"No exception occured");


    };
    @AfterAll
    @Disabled
    static void afterAllTests(){
        System.out.println("After all is executed");
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
    @RepeatedTest(3)

    void myTest(RepetitionInfo repetitionInfo){
        System.out.println(repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals("hi","hi");
    }
}


