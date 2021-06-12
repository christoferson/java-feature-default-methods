package demo;

public class Rogue implements Adventurer {

	@Override
	public String name() {
		return "Xara";
	}

	@Override
	public void embark(Journey journey) {
		System.out.println(String.format("%s shadow stepping on %s", this.name(), journey.getName()));
	}

}
