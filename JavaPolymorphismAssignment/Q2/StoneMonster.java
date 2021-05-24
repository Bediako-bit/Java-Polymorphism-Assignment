package Q2;

public class StoneMonster extends Monster {
	//constructor
	public StoneMonster (String name) {
		super(name);
	}
	// Subclass provides actual implementation
	public String attack() {
		return name + " Attack with stones!";
		}

}
