package SRP;

public class launcher {

	public static void main(String[] args) {		
		
		NeuroMuscularSymptom nms = new NeuroMuscularSymptom(155, 1, 10);
		
		CardioVascularSymptom cvs = new CardioVascularSymptom(2, 500, 2);

		RespiratorySymptom rs = new RespiratorySymptom(3, 3, 1);	
		
		Covid19Pacient p = new  Covid19Pacient("Asier", 56);
		
		p.addSymptom(nms, 1);
		p.addSymptom(cvs, 1);
		p.addSymptom(rs, 1);
		
		System.out.println(p.calcCovid19Impact());
		System.out.println(p.sanatedDays() + " egun beharko ditu sendatzeko");
	}
}
