package up1.kata;

public class Doors {

	private int round;
	private int numberOfDoor;
	private final int MAX_DOOR = 100;

	public Doors(int round) {
		this.round = round;
		this.numberOfDoor = MAX_DOOR;
	}

	public Doors(int round, int numberOfDoor) {
		this.round = round;
		this.numberOfDoor = numberOfDoor;
	}

	public boolean[] getDoors() {
		boolean[] doors = new boolean[this.numberOfDoor];
		if (round == 0)
			return doors;
		for (int i = 0; i < this.numberOfDoor; i++) {
			doors[i] = true;
		}
		if (this.round == 2) {
			for (int i = 0; i < this.numberOfDoor; i++) {
				if ((i + 1) % this.round == 0)
					doors[i] = false;
			}
		}
		return doors;
	}

}
