package com.automation.mavenProject.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMagicBuilder {

	@SuppressWarnings("static-method")
	@Test
	void testLucky() {
		assertEquals(7, MagicBuilder.getLucky());
	}

	@SuppressWarnings("static-method")
	@Test
	void testLesserNum() {
		assertFalse(9 < MagicBuilder.getLucky());
	}

	@SuppressWarnings("static-method")
	@Test
	void testGreaterNum() {
		assertTrue(25 > MagicBuilder.getLucky(), "25 is greater than 7");
	}

}
