package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Integer> inputSizes = new ArrayList<Integer>();
		
		// 100
		inputSizes.add(100);
		inputSizes.add(250);
		inputSizes.add(500);
		inputSizes.add(750);
		
		// 1,000
		inputSizes.add(1000);
		inputSizes.add(2500);
		inputSizes.add(5000);
		inputSizes.add(7500);
		
		// 10,000
		inputSizes.add(10000);
		inputSizes.add(25000);
		inputSizes.add(50000);
		inputSizes.add(75000);
		
		// 100,000
		inputSizes.add(100000);
		inputSizes.add(250000);
		inputSizes.add(500000);
		inputSizes.add(750000);
		
		// 1,000,000
		inputSizes.add(1000000);
		inputSizes.add(2500000);
		inputSizes.add(5000000);
		inputSizes.add(7500000);
		
		// 10,000,000
		inputSizes.add(10000000);
		inputSizes.add(25000000);
		inputSizes.add(50000000);
		inputSizes.add(75000000);
		
		for(Integer i : inputSizes) {
			search(i);
		}
		
		System.out.println("FINISHED!");
		
	}
	
	public static void search(int input) {
		System.out.println("Input size: " + input);
		Searcher searcher = new Searcher();
		Random rand = new Random();
		ArrayList<Double> results = new ArrayList<Double>();
		int timesFound = 0;
		int timesNotFound = 0;
		int timesToTest = 100;
		// wrongNumbers is what will be multiplied to the testSize to get a random
		// number to be tested
		// 1.0 = 100% of all inputs are inside the array
		// 2.0 = 50% of all inputs are inside the array
		Double wrongNumbers = 1.0;
//		int testSize = askInputSize();
		int testSize = input;
		for(int i = 0; i < timesToTest; i++) {
			int[] array = searcher.generateSortedArray(testSize);
			int  n = rand.nextInt((int) (testSize * wrongNumbers));
//			System.out.println(n);
			Double result = searcher.linearSearch(array, n);
//			Double result = searcher.binary(array, n);
			if(result != -1) {
				timesFound++;
				results.add(result);
			}
			else {
				timesNotFound++;
			}
		}
		
		System.out.println("array size: " + testSize);
		System.out.println("times tested: " + timesToTest);
		System.out.println("minimum: " + searcher.calculateMinimum(results));
		System.out.println("maximum: " + searcher.calculateMaximum(results));
		System.out.println("average: " + searcher.calculateAverage(results));
		System.out.println("times found: " + timesFound);
		System.out.println("times not found: " + timesNotFound);
		System.out.println();
	}
	
	public static int askInputSize() {
		System.out.print("Input size: " );
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
