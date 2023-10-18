package Homework3;

import org.junit.jupiter.api.Test;

import static Homework3.MainHW.numberInInterval;
import static org.junit.jupiter.api.Assertions.*;


public class numberInIntervalTest {
    @Test
    public void lowerNumberTest(){
        assertFalse(numberInInterval(25));
    }

    @Test
    public void higherNumberTest(){
        assertFalse(numberInInterval(100));
    }
    @Test
    public void minNumberInIntervalTest(){
        assertTrue(numberInInterval(26));
    }
    @Test
    public void maxNumberInIntervalTest(){
        assertTrue(numberInInterval(99));
    }
    @Test
    public void middleNumberInIntervalTest(){
        assertTrue(numberInInterval(50));
    }
}