package unilim.fr.KataParrot;

public class NorweiganParrot extends Parrot{
	private static final double MAXSPEED = 24.0;
	private static final double BASESPEED = 12.0;
	private double voltage;
	private boolean isNailed;
	
	public NorweiganParrot(double voltage, boolean isNailed) {
		super();
		this.voltage = voltage;
		this.isNailed = isNailed;
	}
	public double getSpeed() {
		if (isNailed){
			return 0.0;
		}
		return getBaseSpeed(voltage);
	}
	private double getBaseSpeed(double voltage) {
		return Math.min(MAXSPEED, vitesseCalcule());
	}
	private double vitesseCalcule() {
		return this.voltage * getBaseSpeed();
	}
	private double getBaseSpeed() {
		return BASESPEED;
	}

}
