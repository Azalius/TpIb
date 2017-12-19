package unilim.fr.trivia;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
=======
>>>>>>> 258ac584aab12752473fc3b816873445bf210ca3
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class GameTest {
	@Test
<<<<<<< HEAD
	public void test_checkTriviaAgainstGoldenMaster() throws IOException{
		GoldenMaster goldenMaster = new GoldenMaster();
		for(long seed = 0 ; seed < 1000 ; seed++) {
			assertEquals(goldenMaster.getGoldenMaster(seed), goldenMaster.getGameResults(seed));
		}
=======
	public void test_goldenMaster() throws IOException {
		GoldenMaster goldenMaster = new GoldenMaster();
		goldenMaster.generateGoldenMaster();
		
		assertTrue(true);
>>>>>>> 258ac584aab12752473fc3b816873445bf210ca3
	}
}
