package LSK;

public class IncurableSymptom extends Symptom{
	
	public IncurableSymptom(String name, int covidImpact, int severityIndex) {
		super();
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}
	
	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"+
		severityIndex+" covidImpact:"+covidImpact);
		}
	
	
}
