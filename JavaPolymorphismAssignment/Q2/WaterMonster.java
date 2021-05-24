package Q2;

public class WaterMonster extends Monster {
	//constructor
	public WaterMonster (String name) {
		super(name);
	}
	// Subclass provides actual implementation
	public String attack(){ 
		return name + " Attack with water!";
		

	}

}
