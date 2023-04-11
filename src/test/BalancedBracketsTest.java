package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void numberIsPresent() {
        int[] intArray = {1,2,3,4,5};
        assertEquals(1, BonusBinarySearch.binarySearch(intArray,2));
        assertEquals(4, BonusBinarySearch.binarySearch(intArray,5));

    }
    @Test
    public void numberIsNotPresent() {
        int[] intArray = {1,2,3,4,5};
        assertEquals(-1, BonusBinarySearch.binarySearch(intArray,-1));
        assertEquals(-1, BonusBinarySearch.binarySearch(intArray,6));
    }


}
