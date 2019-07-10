package code.challenges401.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void test_repeatedWord_case() {
        assertEquals("a", RepeatedWord.repeatedWord("A cat a hat"));
    }

    @Test
    public void test_repeatedWord_no_repeat() {
        assertNull(RepeatedWord.repeatedWord("A cat's hat"));
    }

    @Test
    public void test_repeatedWord_two_repeats() {
        assertEquals("cat's", RepeatedWord.repeatedWord("A cat's hat.  The cat's fat"));
    }

    @Test
    public void test_repeatedWord_empty_string() {
        assertEquals(null, RepeatedWord.repeatedWord(""));
    }

    @Test
    public void test_repeatedWord_null_string() {
        assertEquals(null, RepeatedWord.repeatedWord(null));
    }

}