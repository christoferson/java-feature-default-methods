package demo;

import java.util.Objects;

public interface Adventurer {

	String name();
	
	default void embark(Journey journey) {
		Objects.requireNonNull(journey);
		System.out.println(String.format("%s embarking on %s", this.name(), journey.getName()));
	}

}
