package azalius.gameofdice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Random;

import org.junit.Test;


public class DiceTest {
	@Test
	public void rollReturnsAValue() {
		Dice theDice = new Dice(new Random());
		for (int i = 0; i < 100; i++) {
			int result = theDice.roll();
			assertTrue(result >= 1);
			assertTrue(result <= 6);
		}
	}
	@Test(expected = RuntimeException.class)
 	public void identifyBadValuesGreaterThanNumberOfFaces() {
 		Random rng = mock(Random.class);
 		when(rng.nextInt(6)).thenReturn(14);
 		Dice theDice = new Dice(rng);
 		theDice.roll();
 	} 
	
	@Test(expected = RuntimeException.class)
 	public void identifyBadValuesLesserThanOne() {
 		Random rng = mock(Random.class);
 		when(rng.nextInt(6)).thenReturn(-18);
 		Dice theDice = new Dice(rng);
 		theDice.roll();
 	} 

}
