package com.webtest.ljjdemo;

import com.webtest.core.BaseTest;
import org.testng.annotations.Test;

public class Demo extends BaseTest {

    @Test
    public void test1(){
        webtest.open("/index.php/denglu.html");

    }
}
