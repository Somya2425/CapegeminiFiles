package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessorTest {
    StringProcessor processor = new StringProcessor();
    @Test
    public void testConcatenate(){
        StringProcessor processor = new StringProcessor();
        assertEquals("HelloWorld", processor.concatenate("Hello", "World"));
    }

    @Test
    public void testPalindromeTrue(){
        StringProcessor processor = new StringProcessor();
        assertTrue(processor.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeFalse(){
        StringProcessor processor = new StringProcessor();
        assertFalse(processor.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeNull(){
        StringProcessor processor = new StringProcessor();
        assertFalse(processor.isPalindrome(null));
    }
}
