package iut.unilim.fr.KataCarRacing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

import helpers.AlarmBuilder;

public class AlarmTest {

	@Test
	public void alarmeSeDeclenche_EnCasDeValeurTropBasse() {
		Alarm alarm = new AlarmBuilder()
				.usingSensor(thatProbes(0.0))
				.withSafetyRange(17, 21)
				.build();
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}

	@Test
	public void alarmeSeDeclenche_EnCasDeValeurTropForte() {
		Alarm alarm = new AlarmBuilder()
				.usingSensor(thatProbes(30.0))
				.withSafetyRange(17, 21)
				.build();
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}

	@Test
	public void alarmeNeSeDeclenchePas_SiValeurDansSeuilDeSecurite() {
		Alarm alarm = new AlarmBuilder()
				.usingSensor(thatProbes(20.0))
				.withSafetyRange(17, 21)
				.build();
		alarm.check();
		assertFalse(alarm.isAlarmOn());
	}

	@Test
	public void uneFoisDeclenchee_alarmeResteDeclenchee_QuelleQueSoitLaValeur() {Alarm alarm = new AlarmBuilder()
	.usingSensor(thatProbes(30.0, 20.0))
	.withSafetyRange(17, 21)
	.build();

		alarm.check();
		assertTrue(alarm.isAlarmOn());

		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}

	
}
