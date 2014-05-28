package up1.kata;

public class Doors {

	private int round;
	
	public Doors(int round) {
		this.round = round;
	}

	public boolean[] getDoors() {
		boolean[] doors = new boolean[100];
		if(round ==0) return new boolean[100];
		for(int i=0;i<100; i++) {
			doors[i] = true;
		}
		return doors;
	}

}
