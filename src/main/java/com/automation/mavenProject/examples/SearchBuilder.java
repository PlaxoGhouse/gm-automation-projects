package com.automation.mavenProject.examples;

public class SearchBuilder {
	public static int linearSearch(int[] arr, int key) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (key == arr[i])
				return i;
		}
		return -1;
	}
}
