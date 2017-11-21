package iut.unilim.fr.KataCarRacing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class AlarmTest {
	
	@Test
	public void test_AlarmeSeDeclenche_ValeurTropBasse() {
		Sensor sensor = capteurQuiSonde(15.0);
		
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}
	
	@Test
	public void test_AlarmeSeDeclenche_ValeurTropHaute() {
		Sensor sensor = capteurQuiSonde(25.0);
		
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	
		
	}

	@Test
	public void test_AlarmeNeSeDeclenchePas_ValeurDansLeSeuil() {
		Sensor sensor = capteurQuiSonde(20.0);
		
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		assertFalse(alarm.isAlarmOn());
	
	}
	
	@Test
	public void test_qqch() {
		Sensor sensor = capteurQuiSonde(30.0,20.0);
		
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		assertTrue(alarm.isAlarmOn());
		
	
	}
	
	private Sensor capteurQuiSonde(double value1, double value2) {
		Sensor sensor = mock(PressureSensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(value1, value2);
		return sensor;
	}
	
	private Sensor capteurQuiSonde(double d) {
		Sensor sensor = mock(PressureSensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(d);
		return sensor;
	}
}
