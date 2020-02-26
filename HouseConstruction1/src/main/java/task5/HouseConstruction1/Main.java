package task5.HouseConstruction1;


import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		LOGGER.info("Enter standard_of_material");
		String standard_of_material=s.next();
		LOGGER.info("Do you want a fully automated house?");
		String fully_automated=s.next();
		LOGGER.info("Enter total area");
		double total_area=s.nextDouble();
		HouseConstruction hc=new HouseConstruction(standard_of_material,fully_automated,total_area);
		LOGGER.info("Construction cost of house is:");
		LOGGER.info(hc.calc_construction_cost());
				
	}

}
