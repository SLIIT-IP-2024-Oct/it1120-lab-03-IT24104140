import java.util.Scanner ;

	public class IT24104140Lab3Q1A {
	
		public static void main (String[] args) {

		Scanner ab = new Scanner (System.in) ;
		
		System.out.println ("Enter the price of 1 kg rice : " );
		double price = ab.nextDouble ();

		System.out.println ("Enter the number of kilograms you want to buy : " );
		double quantity = ab.nextDouble ();
		
		double priceofRice = price * quantity ;
		System.out.println ("Your amount is : " +priceofRice ) ;

		}
}