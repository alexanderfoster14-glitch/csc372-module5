public class productsum {
	
	public static void sumProduct(double[] numbs, int elementPosition, double sumTotal) {
		
		if (elementPosition > 4) {
			System.out.println("Product of numbers is: " + sumTotal);
		}
		else {
			sumTotal = sumTotal * numbs[elementPosition];
			sumProduct(numbs, elementPosition + 1, sumTotal);
		}
	}
	
	public static void main (String args[]) {
		double sumTotal;
		double[] numbs = new double[5];
		numbs[0] = 2;
		numbs[1] = 3;
		numbs[2] = 4;
		numbs[3] = 5;
		numbs[4] = 6;
		
		System.out.println("Numbs are: " + numbs[0] + " "
		+ numbs[1] + " " + numbs[2] + " "
		+ numbs[3] + " " + numbs[4]);
		
		System.out.println("Product of numbers is: "
			+ numbs[0] * numbs[1] * numbs[2] * numbs[3] * numbs[4]);
		
		sumTotal = 1;
		sumProduct(numbs, 0, sumTotal);
		
		
	}
	
}