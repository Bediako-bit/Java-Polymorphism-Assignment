package Q2;

public class FireMonster extends Monster{
	//constructor
	
public FireMonster (String name) {
	super(name);
}
	// Subclass provides actual implementation
	public String attack(){ 
		return name + " Attack with fire!";
	}

}
