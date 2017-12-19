package unilim.fr.fizzbuzzbang;

import java.util.ArrayList;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		
		ArrayList<Regle> alts = new ArrayList<Regle>();
		String aRet = "";
		
		alts.add(new Fizz());
		alts.add(new Buzz());

		for (Regle alt : alts) {
			if (alt.isInterestedIn(nombre)) {
				aRet += alt.getKeyWord();
			}
		}
		
		if ("".equals(aRet)) {
			return String.valueOf(nombre);
		}
		return aRet;
	}

}