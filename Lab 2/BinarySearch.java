package lab2;

public class BinarySearch {

	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;
		int avIn = 0;
		int fIn = 0;
		int lIn = data.length-1;
		while(fIn < lIn) {
			avIn = fIn + (lIn - fIn)/2;
			if(numberToFind <= data[avIn]) {
				lIn = avIn;
			}
			else {
				fIn = avIn + 1; 
			}
		}
		if(numberToFind == data[lIn]) {
			System.out.println(lIn);
		}
		else {
			System.out.println(-1);
		}
	}
}