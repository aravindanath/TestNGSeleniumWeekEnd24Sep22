package day1;

import org.testng.annotations.Test;

public class ExampleDepends {


    @Test(dependsOnMethods = "test_1111")
    public void test_101(){
        System.out.println("test_101");
    }

    @Test(priority = 3)
    public void test_11(){
        System.out.println("test_11");
    }


    @Test(dependsOnMethods = "test_11")
    public void test_1(){
        System.out.println("test_1");
    }


    @Test
    public void test_1111(){
        System.out.println("test_1111");
    }
}

