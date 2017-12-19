package unilim.fr.fizzbuzzbang;

import java.util.ArrayList;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		
		ArrayList<Regle> regles = FizzBuzzRegleFactory.build();
		String aRet = "";
		

		for (Regle regle : regles) {
			if (regle.isInterestedIn(nombre)) {
				aRet += regle.getKeyWord();
			}
		}
		
		if ("".equals(aRet)) {
			return String.valueOf(nombre);
		}
		return aRet;
	}

}