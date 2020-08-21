package com.jaredengler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    ParensBalancer parensBalancer = new ParensBalancer();

    @Test
    public void testEmptyString() {
        assertTrue(parensBalancer.isBalanced(""));
    }

    @Test
    public void testOneParen() {
        assertFalse(parensBalancer.isBalanced("("));
        assertFalse(parensBalancer.isBalanced(")"));
    }

    @Test
    public void testTwoParen() {
        assertTrue(parensBalancer.isBalanced("()"));
    }

    @Test
    public void testThreeParen() {
        assertFalse(parensBalancer.isBalanced("())"));
    }

}
