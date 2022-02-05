package com.automation.mavenProject.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMessageBuilder {

    @Test
    void testHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }
    
    @Test
    void testHelloWorld1() {
    	assertNotEquals("hello earth", MessageBuilder.getHelloWorld());
    }    
    
    @Test
    void testLesserNumber() {
    	assertFalse(71 < MessageBuilder.getNumber60());
    }
    
    @Test
    public void testGreaterNumber() {
    	assertTrue(75 > MessageBuilder.getNumber60(), "75 is greater than 60");
    }

    @Test
	public void testNumber60() {
    	assertEquals(60,MessageBuilder.getNumber60());
    }

}