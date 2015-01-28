
public class MaxProfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []prices = {11,5,1,2,10,3};
		maxProfit(prices);

	}

	private static void maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		int [] profits = new int[prices.length];
		int []Pmax = new int[prices.length];
		for (int i = 0; i < profits.length; i++) {
			profits[i] = 0;
			Pmax[i] = 0;
			
		}
		profits[2] = prices[1] - prices[0]>0?prices[1] - prices[0]:0;
		Pmax[2] =  prices[1] - prices[0]>0?prices[1]:-1;
		for (int i = 3; i < Pmax.length; i++) {
			if(Pmax[i-1] !=-1 && (prices[i] > Pmax[i-1]))
			{
				profits[i] = prices[i] -Pmax[i-1] + profits[i-1];
				Pmax[i] = prices[i];
			}
			else if(Pmax[i-1] ==-1 && (prices[i] >prices[i-1]))
			{
				profits[i] = (prices[i] -prices[i-1]);
				Pmax[i] = prices[i];
			}
			
			
			
		}
		
		for (int i : profits) {
			System.out.println(" i "+i);
		}
		
	}

}
