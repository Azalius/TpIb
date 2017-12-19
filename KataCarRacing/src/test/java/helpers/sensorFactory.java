package helpers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import iut.unilim.fr.KataCarRacing.Sensor;

public class sensorFactory {
	private Sensor thatProbes(double value) {
		Sensor sensor = mock(Sensor.class);
		when(sensor.probeValue()).thenReturn(value);
		return sensor;
	}

	private Sensor thatProbes(double value1, double value2) {
		Sensor sensor = mock(Sensor.class);
		when(sensor.probeValue()).thenReturn(value1).thenReturn(value2);
		return sensor;
	}
	
}
