package LSK;

public class curableSymptom extends Symptom{

	
	
	public curableSymptom(String name, int covidImpact, int severityIndex) {
		super();
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}

	public void show() {
		System.out
				.println("symptom value :" + name + " severityIndex :" + severityIndex + " covidImpact:" + covidImpact);
	}

	public void cure() {
		System.out.println("treatment applied to: " + name);
	}
	
}
