package demo;

// Virtual extension or defender methods
// declare a non-abstract method inside the interface
// diamond problem
// should not be the first option
public class TryFeatureDefaultMethod {

	public static void main(String[] args) {
		
		tryDefaultMethod();

		tryOverrideDefaultMethod();

	}
	
	private static  void tryDefaultMethod() {
		Journey journey = new Journey("The Phoenix on the Sword");
		Adventurer adventurer = new Barbarian();
		adventurer.embark(journey);
	}
	
	private static  void tryOverrideDefaultMethod() {
		Journey journey = new Journey("The Phoenix on the Sword");
		Adventurer adventurer = new Rogue();
		adventurer.embark(journey);
	}

}
