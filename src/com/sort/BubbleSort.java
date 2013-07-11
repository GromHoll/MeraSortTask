package com.sort;

/**
 * @author GromHoll
 */
public class BubbleSort extends AbstractSort {

	@Override
	protected void doSort() {		
		for(int j = 1; j < array.length; j++) {
			for(int i = 0; i < array.length - j; i++) {
				if(isLess(i+1, i)) {
					swap(i+1, i);
				}
			}
		}		
	}

}
