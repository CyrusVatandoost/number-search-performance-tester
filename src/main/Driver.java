package main;

import java.util.ArrayList;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Searcher searcher = new Searcher();
		
		Random rand = new Random();
		ArrayList<Double> results = new ArrayList<Double>();;
		for(int i = 0; i < 1000; i++) {
			int[] array = searcher.generateSortedArray(10000000);
			int  n = rand.nextInt(10000000);
			System.out.println(n);
			results.add(searcher.linearSearch(array, n));
		}
		
		System.out.println("array size: " + 10000000);
		System.out.println("times tested: " + 50);
		
		int total = results.size();
		
		// find min
		double min = results.get(0);
		for(Double d : results) {
			if(d < min) {
				min = d;
			}
		}
		System.out.println("minimum: " + min);
		
		// find max
		double max = results.get(0);
		for(Double d : results) {
			if(d > max) {
				max = d;
			}
		}
		System.out.println("maximum: " + max);
		
		// find average
		double average = 0;
		double sum = 0;
		for(Double d : results) {
			sum += d;
		}
		average = sum / results.size();
		System.out.println("average: " + average);
	}

}
