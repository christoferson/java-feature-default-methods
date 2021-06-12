package demo;

public class TryFeatureDefaultMethod {

	public static void main(String[] args) {
		
		Journey journey = new Journey("The Phoenix on the Sword");
		
		Adventurer adventurer = new Barbarian();
		
		adventurer.embark(journey);

	}

}
