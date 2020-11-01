package SRP;

import java.util.Map;

public class afection {

	public afection() {}
	
	public double calculateAfection(Map<symptoms, Integer> symptoms) {
		
		double afection = 0;
		double elems = 0;
		
		for (symptoms symptom:symptoms.keySet()) {
			if (symptom.getCovidImpact()>50) {
			afection = afection +symptom.getSeverityIndex()*symptoms.get(symptom);
			elems++;
			}
		}
			afection = afection /elems;
			
			return afection;	
	}
	
	
}
