package main;

import java.util.ArrayList;

public class Searcher {
	
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
	
	public double calculateMinimum(ArrayList<Double> array) {
		double min = array.get(0);
		for(Double d : array) {
			if(d < min) {
				min = d;
			}
		}
		return min;
	}
	
	public double calculateMaximum(ArrayList<Double> array) {
		double max = array.get(0);
		for(Double d : array) {
			if(d > max) {
				max = d;
			}
		}
		return max;
	}
	
	public double calculateAverage(ArrayList<Double> array) {
		double sum = 0;
		for(Double d : array) {
			sum += d;
		}
		return sum / array.size();
	}
	
}
