package com.sort.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import com.sort.AbstractSort;
import com.sort.BubbleSort;
import com.sort.QuickSort;

/**
 * @author GromHoll
 */
public class SortTest {
	
	private Integer[] generateIntegerArray() {
		Random random = new Random();		
		Integer[] array = new Integer[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		
		return array;
	}
	
	private boolean isSorted(Integer[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void testQuickSort() {
		System.out.println("=== QuickSort Test ===");
		
		Integer[] array = generateIntegerArray();
		
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(array));
		
		AbstractSort quicksort = new QuickSort();
		quicksort.sort(array);
		
		System.out.println("After sorting:");
		System.out.println(Arrays.toString(array));
		
		assertTrue(isSorted(array));
	}
	
	@Test
	public void testBubbleSort() {
		System.out.println("=== BubbleSort Test ===");
		
		Integer[] array = generateIntegerArray();
		
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(array));
		
		AbstractSort bubblesort = new BubbleSort();
		bubblesort.sort(array);
		
		System.out.println("After sorting:");
		System.out.println(Arrays.toString(array));
		
		assertTrue(isSorted(array));
	}
	
}
