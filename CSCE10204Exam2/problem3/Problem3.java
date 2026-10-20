package problem3;

public class Problem3 {

	public static void main(String[] args) {
		String str = "This is a test";
		char delim = ' ';
		String[] tokens;
		
		tokens = split(str,delim);
		showArray(tokens);
		

	}
	public static void showArray(String[] array) {
		int i;
		
		System.out.printf("[");
		for(i = 0;i < array.length;i++) {
			if(i!=0) {
				System.out.printf(",");
			}
			System.out.printf("%s", array[i]);
		}
		System.out.printf("]\n");
	}
	
	public static String[] split(String str, char delim) {
		
		if (str == null || str.isEmpty()) {
            return new String[]{""};
        }
        
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delim) {
                count++;
            }
        }

        String[] result = new String[count];
        int arrayIndex = 0;
        int start = 0;
        int end = str.indexOf(delim);

        while (end != -1) {
            result[arrayIndex++] = str.substring(start, end);
            start = end + 1;
            end = str.indexOf(delim, start);
        }

        result[arrayIndex] = str.substring(start);

        return result;
	}

}
