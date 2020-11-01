package DIP;

import java.util.Map;



public class calculateSympomsAfection implements calculateAfection{

	
	public calculateSympomsAfection() {}
	
@Override
public double calculateAfection(Map<symptoms, Integer> symptoms) {
	double afection = 0;
	
	for (symptoms symptom:symptoms.keySet()) {
		if (symptom.getCovidImpact()>50) {
		afection = afection +symptom.getSeverityIndex()*symptoms.get(symptom);
		}
	}
		afection = afection /symptoms.size();
		
		return afection;
}
}
