package util;

public class NormUtil {

	public static double norm(double a,double b,double c){
		
		double result=0;
		result =Math.sqrt(Math.pow(a, 2)+Math.pow(c, 2)+Math.pow(b, 2));		
		return result;
	}
}
