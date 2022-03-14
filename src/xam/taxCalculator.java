package xam;

import java.io.IOException;

public class taxCalculator {
	
	
	private double txpay;
	private String empname;
	private boolean isindian;
	private double salary;
	
	
	public double calculateTax(String empname,boolean isindian,double salary) throws IOException
	{
		 if(!isindian) {  
	            
	            throw new IOException("Person is not Indian");    
	             }  
	        else { 
	        	
	        	if(empname.isEmpty())
	        	{
	        		throw new ArithmeticException("Null value");
	        	}
	        	else
	        	{
	        		if(salary>100000)
	        		{
	        			txpay=salary*8/100;
	        			
	        		}
	        		else if(salary>50000)
	        		{
	        			txpay=salary*6/100;
	        		}
	        		else if(salary>30000)
	        		{
	        			txpay=salary*5/100;
	        		}
	        		else
	        		{
	        			throw new ArithmeticException("Value out of index");
	        		}
	        	}
	          
	        }  
		 return txpay;
	    }

}
