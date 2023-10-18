package Homework3;

import org.junit.jupiter.api.Test;

import static Homework3.MainHW.evenOddNumber;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class evenOddNumberTest {

    @Test
    public void evenOddNumberTest(){
        int evenNumber = 20;
        assertTrue(evenOddNumber((evenNumber)));
    }

    @Test
    public void isEvenNumberFalseTest() {
        int oddNumber = 21;
        assertFalse(evenOddNumber((oddNumber)));
    }
}