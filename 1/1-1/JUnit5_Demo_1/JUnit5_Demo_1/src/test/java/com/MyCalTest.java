package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MyCalTest {
    @Test
    public void whenGiveTwoNumbersThenReturnSum(){
//       Assertions.assertEquals(6,MyCal.add("1,2,3"),"It should add the numbers");
        /* Assertions.assertEquals(NullPointerException.class,MyCal.add("A"),"It should numerical numbers"); */
//        Assertions.assertEquals(6,MyCal.addd("1/2/3"),"It should add the numbers");
        Assertions.assertEquals(6,MyCal.ad(-6),"It should be +ve numbers");
    }



}