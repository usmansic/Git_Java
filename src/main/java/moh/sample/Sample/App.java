package moh.sample.Sample;

import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String COMMA_SEPERATED="##,##.00";
	
    public static void main( String[] args )
    {
    	double number=1234.5;
               App app=new App();
        app.convertNumber(number);
    }
    
    
    public void convertNumber(double num){
    	DecimalFormat decimalFormat=new DecimalFormat(COMMA_SEPERATED);
    	decimalFormat.format(num);
    	System.out.println(decimalFormat.format(num));
    	
    	
    }
}
