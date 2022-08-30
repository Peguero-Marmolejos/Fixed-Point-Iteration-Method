
public class FixedPointIteration {
	
	/*
	 * rewrite the function a couple of ways: x= blahblahblah where x(i+1) = xiblahblhablah
	 * use the derivative of those rewrites in the isvalid return
	 * if isvalid is true do fpi else try another equation
	 * 
	 */
	public static void main(String []args) {
	
			double c = fpi(0.499, 100, .0001);//initial guess, max iterations, tolerance
			System.out.println("This is Fixed point iteration : " + c);
	}
	public static double fpi(double r, double k, double tol) {
		double f = 0.0;
		while(k > 0 && Math.abs(r-f(r)) > tol) {
			k--;
			f = f(r);
			System.out.println("\nf : " + f);
			r=f;

		}
		return f;
	}
	
	/*public static Boolean isValid( double val) {
	
		return Math.abs(3*(val*val) - 2) < 1;//derivative of the rewrite
	}*/
	
	public static double f(double x) {
		
		//Math.pow(number, exponents)
		//System.out.println(Math.pow(((2*x)+2), 1/3));
		return Math.pow(x*x*x+ x*x - 3*x+0.8+0.160314,.46289567164);
	}
}

