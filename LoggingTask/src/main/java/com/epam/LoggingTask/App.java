package com.epam.LoggingTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	 static double Calculate_Compound_Interest(double principle_amount,double rate_of_interest,double time)
	    {
	        //ci=p*(1+r/100)^time ---> formulae for calculating Compound_Interest
	    	
	    double compound_Interest =principle_amount * (Math.pow ((1 + (rate_of_interest / 100)), time)); 
	    
	    return compound_Interest;
	    }
	    
	    
	    
	    static double Calculate_Simple_Interest(double principle_amount,double rate_of_interest,double time)
	    {
	         //si=(p*t*r )/100---> formulae for calculating Simple_Interest
	    	
	    	
	    return (principle_amount * rate_of_interest * time) / 100;
	    
	    
	    }
	
    public static void main( String[] args )
    {
    	 double principle_amount=10000;
	        
	        double rate_of_interest=10.25;
	        
	        double time=5; 
	  
	        /* Calculating  compound interest using formula by calling static method*/
	        
	        LOGGER.debug("Compound Interest is "+Calculate_Compound_Interest(principle_amount,rate_of_interest,time)); 
	        
	        
	        
	         /* Calculating simple interest using formula by calling static method*/
	         
	       LOGGER.debug("Simple Interest is "+Calculate_Simple_Interest(principle_amount,rate_of_interest,time)); 
	        	
    
    }
}
