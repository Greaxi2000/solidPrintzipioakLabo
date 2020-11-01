package LSK;

public class launcher {

	public static void main(String[] args) {		
		
		IncurableSymptom is = new IncurableSymptom("tristura", 50, 2);	
		curableSymptom cs = new curableSymptom("sukarra", 10, 1);
		
		Covid19Pacient p = new  Covid19Pacient("Asier", 10);
		
		p.addSymptom(is, 1);
		p.addSymptom(cs, 1);
		p.cure();
	}
}
