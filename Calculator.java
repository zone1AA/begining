package practicingJava;

public class Calculator {

	public double addition (double arg1, double arg2 ) {
			double sub= arg1+arg2;
			return sub;
 }
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double sub = cal.addition(13.222, 12.88)	;
		System.out.println("Result of the addition is ");
		System.out.println( sub );
	}
}