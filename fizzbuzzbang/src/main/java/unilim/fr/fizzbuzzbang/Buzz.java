package unilim.fr.fizzbuzzbang;

public class Buzz extends Regle {

	@Override
	public boolean isInterestedIn(Integer nombre) {
		return 0 == nombre % 5;
	}

	@Override
	public String getKeyWord() {
		return "buzz";
	}

}
