package lab2;

public class ArraySort {

	public static void main(String[] args){
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;
		int j = 0;
		int t;
		while(j < length - 1)
		{
			if(array[j+1] >= array[j])
			{
				++j;
			}
			else
			{
				t = array[j];
				array[j] = array[j+1];
				array[j+1] = t;
				j = 0;
			}
		}
		
		
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
    }
}