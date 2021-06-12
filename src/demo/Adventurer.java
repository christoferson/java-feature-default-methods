package demo;

public interface Adventurer {

	String name();
	
	default void embark(Journey journey) {
		System.out.println(String.format("%s embarking on %s", this.name(), journey.getName()));
	}

}
