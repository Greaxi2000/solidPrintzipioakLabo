package SRP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}

	Map<symptoms, Integer> symptoms = new HashMap<symptoms, Integer>();
	
//	Map<CardioVascularSymptom, Integer> cardios = new HashMap<CardioVascularSymptom, Integer>();
//	Map<NeuroMuscularSymptom, Integer> neuros = new HashMap<NeuroMuscularSymptom, Integer>();
//	Map<RespiratorySymptom, Integer> respirs = new HashMap<RespiratorySymptom, Integer>();

//	public void addCardioSymptom(CardioVascularSymptom c, Integer w) {
//		cardios.put(c, w);
//	}
//
//	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm, Integer w){
//		neuros.put(nm,w);
//	}
//
//	public void addRespiratorySymptom(RespiratorySymptom r, Integer w) {
//		respirs.put(r, w);
//	}
	
	public void addSymptom(symptoms s, Integer w) {
		symptoms.put(s, w);
	}

	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		
		afection f = new afection();
		increment i = new increment();
		impact im = new impact();
		//calculate afection		
		afection = f.calculateAfection(symptoms);
		//calculate increment
		increment = i.calculateIncrement(this, afection);
	
		//calculate impact
		
		return im.calculateImpact(this, afection, increment);
	}
	double sanatedDays() {
		
		double handiena = 0;
		for(symptoms symptom : symptoms.keySet()) {
			if (handiena < symptom.sanatedDays()) {
				handiena = symptom.sanatedDays();
			}
		}
		return handiena;
	}
	
}
