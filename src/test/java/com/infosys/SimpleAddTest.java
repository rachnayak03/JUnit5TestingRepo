package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class SimpleAddTest {
// public static Collection<Integer[]> data(){
//     return Arrays.asList(new Integer[][] {{10,20,30},{30,40,70}});
// }
// @ParameterizedTest
// @MethodSource("data")
//
// void addTest(int a,int b){
//
// }
@ParameterizedTest
@CsvSource({"10,20,30","3,4,7"})
void add(int a,int b,int c){

    int expected=30;
    int actual=a+b;

    Assertions.assertEquals(c,actual);

}


}
