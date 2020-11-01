package ISP;


public class launcher {

	
public static void main(String[] args) {		
				
		calculateIncrementPerYear cipy = new calculateIncrementPerYear();	
		
		pertsona p = new pertsona("Asier", 50);
		
		
		
		
		System.out.println(p.getName() + "-en inkrementua ondorengoa da: " + cipy.calculateIncrement(p, 40));
	}
}
