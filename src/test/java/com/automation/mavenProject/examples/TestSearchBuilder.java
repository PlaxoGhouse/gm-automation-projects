/**
 * 
 */
package com.automation.mavenProject.examples;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Gm
 *
 */
class TestSearchBuilder {

	@SuppressWarnings("static-method")
	@Test
	void testlinearSearch() {
		int[]  arr = {2, 4, 5, 56, 60, 77, 82, 99, 10};
		int key = 60;
		int result = SearchBuilder.linearSearch(arr, key);
		if (result == -1) {
			assertTrue(result < 1, "Received unexpected result");
		} else {
			assertTrue(result > 1);			
		}
	}

	@SuppressWarnings("static-method")
	@Test
	void testlinearSearch_negativecase() {
		int[] arr = {2, 4, 5, 56, 60, 77, 82, 99, 10};
		int key = 7;
		int result = SearchBuilder.linearSearch(arr, key);
		if (result == -1) {
			assertTrue(result < 1);			
		} else {
			assertTrue(result > 1, "Received unexpected result");			
		}
	}
}
