package ISP;


public class calculateIncrementPerYear implements calculateIncrement {

	public calculateIncrementPerYear() {
	
	}
	
	@Override
	public double calculateIncrement(yearAble year, double afection) {
		double increment = 0;
		
		if (year.getYears() > 65)
			increment = afection * 0.5;
		else if(year.getYears() <65 && year.getYears() > 45) {
			increment = afection * 0.3;
		}
		
		return increment;
		
		
		
	}
	
}
