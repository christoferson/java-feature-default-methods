package demo;

import java.util.Objects;

public interface SpaceAdventurer extends Adventurer {

	void embark(Journey journey);
	
	default void lodge(Inn inn) {
		Objects.requireNonNull(inn);
		System.out.println(String.format("%s is floating on %s", this.name(), inn.getName()));
	}
}
