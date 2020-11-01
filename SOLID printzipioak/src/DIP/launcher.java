package DIP;

public class launcher {

	public static void main(String[] args) {		
		
		NeuroMuscularSymptom nms = new NeuroMuscularSymptom(61, 15, 10);
		CardioVascularSymptom cvs = new CardioVascularSymptom(24, 83, 44);
		RespiratorySymptom rs = new RespiratorySymptom(35, 34, 12);	
		
		Covid19Pacient p = new  Covid19Pacient("Asier", 60);
		
		p.addSymptom(nms, 5);
		p.addSymptom(cvs, 2);
		p.addSymptom(rs, 3);
		
		
		calculateSympomsAfection ca = new calculateSympomsAfection();
		calculateIncrementPerYear incr = new calculateIncrementPerYear();
		
		System.out.println(p.getName() + " pazientearen covid19 inpaktua ondorengoa da: " + p.calcCovid19Impact(ca, incr));
	}
}
