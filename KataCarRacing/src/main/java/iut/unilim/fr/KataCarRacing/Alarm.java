package iut.unilim.fr.KataCarRacing;

public class Alarm {
	private final double lowThreshold = 17;
	private final double highThreshold = 21;

	Sensor sensor;
	boolean alarmOn;

	public Alarm() {
		this(new PressureSensor());
	}
	
	public Alarm(Sensor sensor) {
		this.sensor=sensor;
		this.alarmOn = false;
	}
	
	public void check() {
		double value = probeValue();

		if (isNotSafe(value)) {
			this.alarmOn = true;
		}
	}

	private boolean isNotSafe(double value) {
		return value < lowThreshold || highThreshold < value;
	}

	private double probeValue() {
		double value = sensor.popNextPressurePsiValue();
		return value;
	}

	public boolean isAlarmOn() {
		return alarmOn;
	}
}