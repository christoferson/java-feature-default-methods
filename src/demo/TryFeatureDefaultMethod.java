package demo;

// Virtual extension or defender methods
// declare a non-abstract method inside the interface
// diamond problem
// should not be the first option
public class TryFeatureDefaultMethod {

	public static void main(String[] args) {
		
		tryDefaultMethod();

		tryOverrideDefaultMethod();
		
		tryOverrideDefaultMethodToResolveDiamondProblem();

	}
	
	// Calls default method embark
	private static  void tryDefaultMethod() {
		Journey journey = new Journey("The Phoenix on the Sword");
		Adventurer adventurer = new Barbarian();
		adventurer.embark(journey);
	}
	
	// Overrides default method embark on implementing class Rogue
	private static  void tryOverrideDefaultMethod() {
		Journey journey = new Journey("The Phoenix on the Sword");
		Adventurer adventurer = new Rogue();
		adventurer.embark(journey);
	}
	
	// Priest inherits both embark on Adventurer and Voyager resulting in Diamond Problem.
	// Problem is resolved by specifying which embark to use via Voyager.super.embark(journey);
	private static  void tryOverrideDefaultMethodToResolveDiamondProblem() {
		Journey journey = new Journey("The Phoenix on the Sword");
		Adventurer adventurer = new Priest();
		adventurer.embark(journey);
		Voyager voyager = new Priest();
		voyager.embark(journey);
	}


}
