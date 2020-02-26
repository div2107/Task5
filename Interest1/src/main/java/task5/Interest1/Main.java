package task5.Interest1;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		LOGGER.info("Enter principle");
		int principle=s.nextInt();
		LOGGER.info("Enter interest_rate");
		int interest_rate=s.nextInt();
		LOGGER.info("Enter term_of_loan");
		int term_of_loan=s.nextInt();
		SimpleInterest si=new SimpleInterest(principle,interest_rate,term_of_loan);
		LOGGER.info("Simple Intterest is:");
		LOGGER.error(si.calc_simple_interest());
		LOGGER.info("Enter initial_principle_balance:");
		double initial_principle_balance=s.nextDouble();
		LOGGER.info("Enter rate_of_interest:");
		double rate_of_interest=s.nextDouble();
		LOGGER.info("Enter number_of_times_interest_applied");
		double number_of_times_interest_applied=s.nextDouble();
		LOGGER.info("Enter number_of_time_periods_elapsed");
		double number_of_time_periods_elapsed=s.nextDouble();
		CompoundInterest ci=new CompoundInterest(initial_principle_balance,rate_of_interest,number_of_times_interest_applied,number_of_time_periods_elapsed);
		LOGGER.info("Compound Interest is:");
		LOGGER.info(ci.calc_compound_interest());
		
		
		
	}

}
