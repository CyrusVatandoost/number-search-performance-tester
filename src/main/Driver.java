package main;

public class Driver {

	public static void main(String[] args) {
		Searcher searcher = new Searcher();
		for(int i = 0; i < 100; i++) {
			int[] array = searcher.generateSortedArray(100);
			searcher.linearSearch(array, 100);
		}
	}

}
