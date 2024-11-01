
import java.util.Scanner ;

	public class IT24104140Lab3Q2 {

		public static void main (String[] args) {
		
		Scanner ab = new Scanner (System.in) ;
		
		System.out.println ("Enter the monthly salary : " ) ;
		double monthlySalary = ab.nextDouble ();

		System.out.println ("Enter the number of OT hours : " ) ;
		double otHours = ab.nextDouble ();

		System.out.println ("Enter the OT hourly rate : " ) ;
		double othourlyRate = ab.nextDouble () ;

		double totalotAmount = otHours * othourlyRate ;
		double totalmonthlySalary = monthlySalary + totalotAmount ;

		System.out.println ("The total salary including OT is : " +totalmonthlySalary) ;

	}
}
 
		