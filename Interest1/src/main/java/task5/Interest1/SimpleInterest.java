package task5.Interest1;

/*import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;*/
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	
	private static final Logger LOGGER=LogManager.getLogger(SimpleInterest.class);
	double principle;
	double interest_rate;
	double term_of_loan;
	double result;
	public SimpleInterest(double principle,double interest_rate,double term_of_loan)
	{
		this.principle=principle;
		this.interest_rate=interest_rate;
		this.term_of_loan=term_of_loan;
		
	}
	public  double calc_simple_interest()
	{
		//PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		result=(principle*interest_rate*term_of_loan)/100;
		return(result); 
				
	}

}
