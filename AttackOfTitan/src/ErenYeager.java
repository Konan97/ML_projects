
public class ErenYeager implements Titans, Kyojin {

	// instance vars
	private double length;
	
	// constructor
	public ErenYeager(double length) {
		this.length = length;
	}
	@Override
	public double power() {
		return Math.pow(length, 3);
	}

	
	@Override
	public String abilities() {
		 
		return "Future memory inheritance";
	}

	@Override
	public double height() {
		
		return 15;
	}

	@Override
	public void draw() {
		
		System.out.println("eren Yeager never obeyed others.");
	}

}
