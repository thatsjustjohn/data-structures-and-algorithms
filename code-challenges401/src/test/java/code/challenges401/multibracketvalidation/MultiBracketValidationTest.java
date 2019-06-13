package code.challenges401.multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void test_multiBracketValidation_pass_0() {
        assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void test_multiBracketValidation_pass_1() {
        assertTrue(MultiBracketValidation.multiBracketValidation("{}(){}"));
    }

    @Test
    public void test_multiBracketValidation_pass_2() {
        assertTrue(MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
    }

    @Test
    public void test_multiBracketValidation_pass_3() {
        assertTrue(MultiBracketValidation.multiBracketValidation("(){}[[]]"));
    }

    @Test
    public void test_multiBracketValidation_pass_4() {
        assertTrue(MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test
    public void test_multiBracketValidation_fail_0() {
        assertFalse(MultiBracketValidation.multiBracketValidation("[({}]"));
    }

    @Test
    public void test_multiBracketValidation_fail_1() {
        assertFalse(MultiBracketValidation.multiBracketValidation("(]("));
    }

    @Test
    public void test_multiBracketValidation_fail_2() {
        assertFalse(MultiBracketValidation.multiBracketValidation("{(})"));
    }

}