package DIP;

public class NeuroMuscularSymptom extends symptoms{

	int covidImpact; 
	int severityIndex;
	int affectedDays;
	
	public double calcCovid19Impact() {
		return this.severityIndex;
		}
	
	public double sanatedDays() {
		return this.affectedDays;
	}
	
	public NeuroMuscularSymptom(int covidImpact, int severityIndex, int affectedDays) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays = affectedDays;
	}

	public int getCovidImpact() {
		return covidImpact;
	}

	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}

	public int getSeverityIndex() {
		return severityIndex;
	}

	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	
	
	
	
}
