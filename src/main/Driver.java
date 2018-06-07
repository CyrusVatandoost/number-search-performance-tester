package main;

import java.util.ArrayList;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Searcher searcher = new Searcher();
		
		Random rand = new Random();
		ArrayList<Double> results = new ArrayList<Double>();
		
		int timesToTest = 100;
		int testSize = 10000000;
		for(int i = 0; i < timesToTest; i++) {
			int[] array = searcher.generateSortedArray(testSize);
			int  n = rand.nextInt(testSize);
			System.out.println(n);
			results.add(searcher.linearSearch(array, n));
		}
		
		System.out.println("array size: " + testSize);
		System.out.println("times tested: " + timesToTest);
		System.out.println("minimum: " + searcher.calculateMinimum(results));
		System.out.println("maximum: " + searcher.calculateMaximum(results));
		System.out.println("average: " + searcher.calculateAverage(results));
	}

}
