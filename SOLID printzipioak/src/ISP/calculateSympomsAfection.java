package ISP;

import java.util.Map;



public class calculateSympomsAfection implements calculateAfection{

	public calculateSympomsAfection() {}
	
	@Override
	public double calculateAfection(Map<symptoms, Integer> symptoms) {
		double afection = 0;
		double elems = 0;
		
		for (ISP.symptoms symptom:symptoms.keySet()) {
			if (symptom.calcCovid19Impact()>50) {
			afection = afection +symptom.getSeverityIndex()*symptoms.get(symptom);
			elems++;
			}
		}
			afection = afection /elems;
			
			return afection;
	}

	



}
