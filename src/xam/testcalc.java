package xam;

import java.io.IOException;

public class testcalc {
	public static void main(String args[]) throws IOException
	{
		
		taxCalculator obj1=new taxCalculator();
		System.out.println(obj1.calculateTax("neeraj",true,10000));
		
	}

}
