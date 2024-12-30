package com.infosys;

import org.junit.jupiter.api.*;
//we are creating one instance for class:modify default functionality
//default is for every test/method there will be different instance
//FOR ONE CLASS SINGLE INSTANCE(PER_CLASS) NO REQUIREMENT FOR STATIC
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChangeDefaultInstanceTest {
    @BeforeAll
    public  void beforeAll(){
        System.out.println("Before all executes");
    }
    @BeforeEach
    public void init(){
        System.out.println("Before each executes");
    }
    @AfterEach
    public void cleaning(){
        System.out.println("After each executes");
    }
    @AfterAll
    public static void freeResource(){
        System.out.println("After all executes");
    }
    @Test
    void myTest(){
        Assertions.assertTrue(5>4);
    }
}
