package com.sort;

/**
 * @author GromHoll
 */
public abstract class AbstractSort {
	
	protected Object[] array;
	private Object temp;	
	
	public void sort(Object[] array) {
		this.array = array;
		doSort();
	}

	protected abstract void doSort();
	
	protected void swap(int first, int second) {
		temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
	protected boolean isLess(int first, int second) {
		@SuppressWarnings("unchecked")
		Comparable<Object> comparable = (Comparable<Object>) array[first];
		return comparable.compareTo(array[second]) == -1;
	}

}
