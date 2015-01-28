
public class MaxContigousSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= { -2 ,3,0,9,-5,4,11};
		int sum =  maxContSum(array,array.length);
		System.out.println("sum "+ sum);
		int [] array2= { -2 ,-3,-4,-9,-5,-4,-11};
		int sum2 =  maxContSum(array2,array2.length);
		System.out.println("sum "+ sum2);

	}

	private static int maxContSum(int[] array, int length) {
		int currentMax =array[0];
		int maxSoFar = array[0];
		for (int i = 1; i < length; i++) {
			
			currentMax = currentMax + array[i] > array[i]? currentMax + array[i]: array[i];
			maxSoFar = currentMax > maxSoFar ? currentMax : maxSoFar;
			
		}
		
		return maxSoFar;
	}
	

}
