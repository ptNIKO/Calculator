package com.digitalleague;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void emptyString() {
        assertEquals(false, Validator.isExpressionValid(""));
    }

    @Test
    void plusWithNegativeValue() {
        assertEquals(true, Validator.isExpressionValid("31 + (-4)"));
    }

    @Test
    void minusWithNegativeValue() {
        assertEquals(true, Validator.isExpressionValid("31 - (-4)"));
    }

    @Test
    void multiWithNegativeValue() {
        assertEquals(true, Validator.isExpressionValid("31 * (-4)"));
    }

    @Test
    void divWithNegativeValue() {
        assertEquals(true, Validator.isExpressionValid("31 / (-4)"));
    }

    @Test
    void operationWithNegativeValueWithoutBracket() {
        assertEquals(false, Validator.isExpressionValid("31 * (-1"));
    }

    @Test
    void fractionalValue() {
        assertEquals(true, Validator.isExpressionValid("2.3 + (-2.3)"));
    }

    @Test
    void divByZero() {
        assertEquals(false, Validator.isExpressionValid("1 / 0"));
    }

    @Test
    void compoundExpression() {
        assertEquals(true, Validator.isExpressionValid("1 + 3 * 1 - 3 / 1 + (-1)"));
    }
}