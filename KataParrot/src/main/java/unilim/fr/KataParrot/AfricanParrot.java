package unilim.fr.KataParrot;

public class AfricanParrot extends Parrot{
	private static final double BASESPEED = 12.0;
	private static final double LOAD_FACTOR = 9.0;
	private int numberOfCoconuts = 0;

	public AfricanParrot(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}

	public double getSpeed() {
		return vitesseOuZeroSiVitesseNegative();
	}

	private double vitesseOuZeroSiVitesseNegative() {
		return Math.max(0, vitesseCalcule());
	}

	private double vitesseCalcule() {
		return getBaseSpeed() - ralentissementACauseNoixDeCoco();
	}
	private double ralentissementACauseNoixDeCoco() {
		return getLoadFactor() * numberOfCoconuts;
	}
	private double getLoadFactor() {
		return LOAD_FACTOR;
	}
	private double getBaseSpeed() {
		return BASESPEED;
	}

}
