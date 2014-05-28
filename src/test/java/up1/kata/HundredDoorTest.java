package up1.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class HundredDoorTest {

	@Test
	public void createAllDoorsWithClosedStatus() {
		Doors doors = new Doors(0);
		for(boolean isOpen : doors.getDoors()) {
			assertFalse(isOpen);
		}
	}
	
	@Test
	public void inFirstRoundAllDoorShouldBeOpen() {
		Doors doors = new Doors(1);
		for(boolean isOpen : doors.getDoors()) {
			assertTrue(isOpen);
		}
	}

}
