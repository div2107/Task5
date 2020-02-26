package task5.HouseConstruction1;

public class HouseConstruction {
	
	String standard_of_material;
    String fully_automated;
    double total_area,cost;
    public HouseConstruction(String standard_of_material,String fully_automated,double total_area)
    {
    	this.standard_of_material=standard_of_material;
    	this.fully_automated=fully_automated;
    	this.total_area=total_area;
    }
    public double calc_construction_cost()
    {
    	if(fully_automated.equals("No"))
    	{
    		if(standard_of_material.equals("standard"))
    		{
    			cost=total_area*1200;
    		}
    		else if(standard_of_material.equals("above_standard"))
    		{
    			cost=total_area*1500;
    		}
    		else if(standard_of_material.equals("high_standard"))
    		{
    			cost=total_area*1800;
    		}
    	}
    	else
    	{
    		if(standard_of_material.equals("high_standard"))
    		{
    			cost=total_area*2500;
    		}
    	}
    	return(cost);
    }

}
