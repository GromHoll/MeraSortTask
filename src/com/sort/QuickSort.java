package com.sort;

/**
 * @author GromHoll
 */
public class QuickSort extends AbstractSort {
	
	@Override
	public void doSort() {
		quicksort(0, array.length-1);
	}
	
	private void quicksort(int begin, int end) {
		if(begin >= end) {
			return;
		}
		
		swap(begin, getMedianIndex(begin, end));
		int median = begin;
		
		for(int i = begin + 1; i <= end; i++) {
			if(isLess(i, begin)) {
				swap(++median, i);
			}
		}
		
		swap(begin, median);
		
		quicksort(begin, median - 1);
		quicksort(median + 1, end);
	}
	
	private int getMedianIndex(int begin, int end) {
		return begin + (end - begin)/2;
	}
}
