package up1.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class HundredDoorTest {

	@Test
	public void createAllDoorsWithClosedStatus() {
		Doors doors = new Doors(0);
		for (boolean isOpen : doors.getDoors()) {
			assertFalse(isOpen);
		}
	}

	@Test
	public void inFirstRoundAllDoorShouldBeOpen() {
		Doors doors = new Doors(1);
		for (boolean isOpen : doors.getDoors()) {
			assertTrue(isOpen);
		}
	}

	@Test
	public void inSecondRoundThenEvenDoorShouldBeClose() {
		Doors doors = new Doors(2, 4);
		assertTrue(doors.getDoors()[0]);
		assertFalse(doors.getDoors()[1]);
		assertTrue(doors.getDoors()[2]);
		assertFalse(doors.getDoors()[3]);
	}

	@Test
	public void inThridRoundThenEvenDoorShouldBeClose() {
		Doors doors = new Doors(3, 6);
		assertTrue(doors.getDoors()[0]);
		assertFalse(doors.getDoors()[1]);
		assertFalse(doors.getDoors()[2]);
		assertFalse(doors.getDoors()[3]);
		assertTrue(doors.getDoors()[4]);
		assertTrue(doors.getDoors()[5]);
	}

	@Test
	public void inOneHundredRoundAllDoorShouldBeOpen() {
		Doors doors = new Doors(100);
		int i = 0;
		for (boolean isOpen : doors.getDoors()) {
			if (Math.sqrt(i + 1) == Math.ceil(Math.sqrt(i + 1)))
				assertTrue(isOpen);
			else
				assertFalse(isOpen);
			i++;
		}
	}

}
