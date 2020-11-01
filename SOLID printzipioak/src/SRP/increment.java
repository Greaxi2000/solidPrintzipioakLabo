package SRP;

public class increment {

	public increment() {}
	
	public double calculateIncrement(Covid19Pacient c19, double afection) {
		double increment = 0;
		
		if (c19.getYears() > 65)
			increment = afection * 0.5;
		else if(c19.getYears() <65 && c19.getYears() > 45) {
			increment = afection * 0.3;
		}
		
		return increment;
		
		
		
	}
	
}
