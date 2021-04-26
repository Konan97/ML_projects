
public class ReinerBraun implements Titans {
	// instance vars
	protected double armoredSkin;
	
	// constructor
	public ReinerBraun(double armoredSkin) {
		this.armoredSkin = armoredSkin;
	}
	
	@Override
	public String abilities() {
		
		return "Hardened plates of armor-like skin";
	}

	@Override
	public double height() {
		
		return 15 + armoredSkin;
	}

	@Override
	public void draw() {
		System.out.println("莱纳, 你坐啊!");

	}

}
