
public class AttackTitan implements Titans {
	
	private static final double PI = Math.PI;
	
	private double radius;
	
	//constructor
	public AttackTitan(double radius) {
		this.radius = radius;
	}
	
	// Implement three abstract methods from the interface
	
	public double area() {
		return AttackTitan.PI * radius;
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
		System.out.println("AttackTitan");
	}
	
	public static void main(String[] args) {
		AttackTitan attacktitan = new AttackTitan(3);
		System.out.println(attacktitan.abilities());

		ReinerBraun armoredTitan = new ReinerBraun(3);
		armoredTitan.draw();
	}
	

}
