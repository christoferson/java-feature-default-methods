package demo;

// Duplicate default methods named embark with the parameters (Journey) and (Journey) are inherited from the types Voyager and Adventurer
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
