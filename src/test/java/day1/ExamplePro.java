package day1;

import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.priority;

public class ExamplePro{


    @Test(priority = 2)
    public void test_101(){
        System.out.println("test_101");
    }

    @Test(priority = 3)
    public void test_11(){
        System.out.println("test_11");
    }


    @Test(priority = 4)
    public void test_1(){
        System.out.println("test_1");
    }


    @Test
    public void test_1111(){
        System.out.println("test_1111");
    }
}

