package main;

public class Searcher {

	public Searcher() {
		
	}
	
	public int[] generateSortedArray(int limit) {
		int[] array = new int[limit];
		for(int i = 0; i < limit; i++) {
			array[i] = i;
		}
		return array;
	}
	
	public double linearSearch(int[] array, int target) {
		long timeStart = System.nanoTime();
//		System.out.println(timeStart);
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				break;
			}
		}
		long timeEnd = System.nanoTime();
//		System.out.println(timeEnd);
//		System.out.println((timeEnd - timeStart) + " nanoseconds");
		double miliseconds = (double) (timeEnd - timeStart) / 1000000.0;
//		System.out.println(seconds + " seconds");
		System.out.println(miliseconds + " miliseconds");
		return miliseconds;
	}
	
	public void binarySearch(int array, int target) {
		
	}
	
}
