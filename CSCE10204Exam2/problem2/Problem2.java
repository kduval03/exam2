package problem2;

public class Problem2 {

	public static void main(String[] args) {
		int[] array1 = {1,1,1,1,1};
		int[] array2 = {2,2,2,2,2};
		int[] result;
		
		result = interleave(array1,array2);
		showArray(result);
		

	}
	public static void showArray(int[] array) {
		int i;
		
		System.out.printf("[");
		for(i = 0;i < array.length;i++) {
			if(i != 0) {
				System.out.printf(",");
			}
			System.out.printf("%d", array[i]);
		}
		System.out.printf("]\n");
	}
	
	public static int[] interleave(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];

	    for (int i = 0; i < array1.length; i++) {
	        result[2 * i] = array1[i];
	        result[2 * i + 1] = array2[i];
	    }

	    return result;
	}

}
