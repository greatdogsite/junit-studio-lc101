package test;
import main.BalancedBrackets ;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(1,1,.001);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void unBalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketsWithWordReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }
    @Test
    public void bracketsInMiddleOfWordReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[wor]d"));
    }
    @Test
    public void emptyStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void singleBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void reversedBracketsInWordReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void singleBracketInWordReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
    }
    @Test
    public void singledNestedBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }
    @Test
    public void multipleBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }@Test
    public void multipleBalancedWithUnbalancedBracketsReturnTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]"));
    }




}
