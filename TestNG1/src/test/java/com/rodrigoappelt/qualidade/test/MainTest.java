package com.rodrigoappelt.qualidade.test;

import org.testng.annotations.*;

public class MainTest {

    @Test
    public void onePlusOneIsTwo(){
        int a = 1;
        int b = 1;
        int result = a + b;
        assert result == 2;
    }
}
