package demo;

import java.util.Objects;

public interface Adventurer {

	String name();
	
	default void embark(Journey journey) {
		Objects.requireNonNull(journey);
		System.out.println(String.format("%s embarking on %s", this.name(), journey.getName()));
	}
	
	default void lodge(Inn inn) {
		Objects.requireNonNull(inn);
		System.out.println(String.format("%s is resting on %s", this.name(), inn.getName()));
	}

}
