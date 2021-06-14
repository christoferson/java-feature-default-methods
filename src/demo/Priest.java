package demo;

// Inherits both Adventurer.embark and Voyager.embark causing ambiguity / Diamond Problem
// This class implements an override that designates Voyager.embark as the method to use, thereby resolving the conflict.
public class Priest implements Adventurer, Voyager {

	@Override
	public String name() {
		return "Athelstan";
	}

	@Override
	public void embark(Journey journey) {
		Voyager.super.embark(journey);
	}
	
}
