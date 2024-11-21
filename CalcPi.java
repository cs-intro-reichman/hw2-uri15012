// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int number = Integer.parseInt(args[0]);

		double sum = 0.0; 
		for (int i = 0; i < number; i++){
			double term = Math.pow(-1,i) / (2*i + 1);
			 sum = sum + term;
		}
		double piApproximation = 4*sum;
		System.out.printf("pi according to Java: %.15f%n" + Math.PI);
		System.out.printf("pi according to Java: %.15f%n" + piApproximation);


	}
}
