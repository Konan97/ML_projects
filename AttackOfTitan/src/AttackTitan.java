
public class AttackTitan implements Titans {
	
	private static final double PI = Math.PI;
	
	private String name;
	
	//constructor
	public AttackTitan() {
		name = "Eren Yeager";
	}
	
	// Implement three abstract methods from the interface
	
	public String name() {
		return name;
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
		AttackTitan attacktitan = new AttackTitan();
		System.out.println(attacktitan.name);
		System.out.println(attacktitan.abilities());

		ReinerBraun armoredTitan = new ReinerBraun(3);
		armoredTitan.draw();
	}
	

}
