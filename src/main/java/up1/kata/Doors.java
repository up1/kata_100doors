package up1.kata;

public class Doors {

	private int round;
	private int numberOfDoor;
	private static final int MAX_DOOR = 100;

	public Doors(int round) {
		this(round, MAX_DOOR);
	}

	public Doors(int round, int numberOfDoor) {
		this.round = round;
		this.numberOfDoor = numberOfDoor;
	}

	public boolean[] getDoors() {
		boolean[] doors = new boolean[this.numberOfDoor];
		if (this.round == 0)
			return doors;

		for (int count = 1; count <= this.round; count++) {
			for (int i = 0; i < this.numberOfDoor; i++) {
				if (isShouldOpen(count, i))
					doors[i] = !doors[i];
			}
		}
		return doors;
	}

	private boolean isShouldOpen(int round, int curentDoor) {
		return ((curentDoor + 1) % round == 0);
	}

}
