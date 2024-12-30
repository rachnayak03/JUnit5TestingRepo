package com.infosys;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.StringUtils;

import java.util.stream.Stream;

public class MethodAsParamTest {

    @ParameterizedTest
    @MethodSource("checkMethodArgs")
    void checkExplicitlyForMethodSource(String names){
        assertTrue(StringUtils.isNotBlank(names),"String is empty");

    }

    public static Stream<String> checkMethodArgs(){
        return Stream.of("hulk","thor","");

    }

    @ParameterizedTest
    @MethodSource //internal method sourc it will check for method name same as test name
    void checkMethodArgs1(String names) {
        assertTrue(StringUtils.isNotBlank(names), "String is empty");
    }
        public static Stream<String> checkMethodArgs1(){
        return Stream.of("hulk","thor","");

    }

    @ParameterizedTest
    @MethodSource("com.infosys.Operations#checkMethodArgs2")
    void checkExplicitlyForMethodSource1(String names){
        assertTrue(StringUtils.isNotBlank(names),"String is empty");

    }
}
