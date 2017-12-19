package unilim.fr.fizzbuzzbang;

import java.util.ArrayList;

public class FizzBuzzRegleFactory {

	public static ArrayList<Regle> build() {
		ArrayList<Regle> ar = new ArrayList();
		ar.add(new Fizz());
		ar.add(new Buzz());
		return ar;
	}

}
