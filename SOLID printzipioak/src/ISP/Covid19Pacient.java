package ISP;

import java.util.HashMap;
import java.util.Map;


public class Covid19Pacient extends Pacient {
	
	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}

	Map<symptoms,Integer> symptoms =  new HashMap<symptoms,Integer>();
	
	double calcCovid19Impact(calculateSympomsAfection ca, calculateIncrementPerYear incr) {
		double afection = 0;
		double increment = 0;
		double impact;
//calculate afection
		afection = ca.calculateAfection(symptoms);
//calculate increment
		increment = incr.calculateIncrement(this, afection);
//calculate impact
		impact = afection + increment;
		return impact;
	}
}