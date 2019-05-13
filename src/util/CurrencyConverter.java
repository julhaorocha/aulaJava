package util;

public class CurrencyConverter {
	
	public  static final double IOF = 1.06;
	public  static double price;
	public  static double qtt;

	
	public static double converter() {

		return (qtt  * IOF) * price ;

}
}
