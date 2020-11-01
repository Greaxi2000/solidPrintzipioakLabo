package DIP;


public class calculateIncrementPerYear implements calculateIncrement{

	public calculateIncrementPerYear() {}
	
	@Override
	public double calculateIncrement(DIP.Covid19Pacient covid19Pacient, double afection) {
		double increment = 0;
		
		if (covid19Pacient.getYears() > 65)
			increment = afection * 0.5;
		else if(covid19Pacient.getYears() <65 && covid19Pacient.getYears() > 45) {
			increment = afection * 0.3;
		}
		
		return increment;
		
		
		
	}

	
}
