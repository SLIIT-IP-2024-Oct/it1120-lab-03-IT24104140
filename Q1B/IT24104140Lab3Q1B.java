import java.util.Scanner ;

public class IT24104140Lab3Q1B {

	public static void main (String[] args) {

	Scanner ab = new Scanner (System.in) ;
	
	System.out.println ("Enter the Price of 1kg rice : ") ;
	double price = ab.nextDouble () ;

	System.out.println ("Enter the number of kilograms you want : ") ;
	double quantity = ab.nextDouble ();

	double totalamount = price * quantity;
	double discountforamount = totalamount * 0.1 ;
	double totalamountwithdiscount = totalamount -  discountforamount ;

	System.out.println ("The total amount with 10% discount is : " +totalamountwithdiscount) ;

	}
}