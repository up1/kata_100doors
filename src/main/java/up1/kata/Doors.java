package up1.kata;

public class Doors {

	private int round;
	private final int MAX_DOOR = 100;

	public Doors(int round) {
		this.round = round;
	}

	public boolean[] getDoors() {
		boolean[] doors = new boolean[MAX_DOOR];
		if (round == 0)
			return doors;
		for (int i = 0; i < MAX_DOOR; i++) {
			doors[i] = true;
		}
		return doors;
	}

}
