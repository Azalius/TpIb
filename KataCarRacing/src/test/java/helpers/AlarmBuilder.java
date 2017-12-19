package helpers;

import iut.unilim.fr.KataCarRacing.Alarm;
import iut.unilim.fr.KataCarRacing.PressureSensor;
import iut.unilim.fr.KataCarRacing.SafetyRange;
import iut.unilim.fr.KataCarRacing.Sensor;

public class AlarmBuilder {
	
	Sensor sensor;
	SafetyRange sf;
	
	public AlarmBuilder usingSensor(Sensor sensor){
		this.sensor = sensor;
		return this;
	}
	public AlarmBuilder withSafetyRange(int min, int max) {
		this.sf = new SafetyRange(min, max);
		return this;
	}
	public Alarm build() {
		return new Alarm(this.sensor, this.sf);
	}
}
