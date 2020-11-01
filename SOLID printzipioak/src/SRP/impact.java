package SRP;

public class impact {

	public impact() {}
	
	public double calculateImpact(Covid19Pacient c19, double afection, double increment) {
		
		if(c19.getYears()<10) {
			return 0;
		}
		else {
			return afection+increment;
		}
		
	}
}
