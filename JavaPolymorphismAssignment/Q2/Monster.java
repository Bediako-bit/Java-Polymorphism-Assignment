package Q2;

public class Monster {
	// protected instance variable
	protected String name;
	
	//constructor
	public Monster (String name) {
		this.name= name;
	}
	// Define common behavior for all its subclasses
	public String attack() {
		return"Err.. I don't know how to attack!";
	}
}


