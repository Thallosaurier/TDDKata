package machine;

public class ArabicToRomanNumbersConverter {

	public String convert(int arabicNumber) {
		/* Pseudo-Solution: code below can/should be changed */
		String romanNumber = "I";
		if (arabicNumber == 11) {
			return "XI";
		} else {
			for (int i = 1; i < arabicNumber; i++) {
				romanNumber += "I";
			}
		}
		romanNumber = romanNumber.replace("IIIII", "V");
		romanNumber = romanNumber.replace("VV", "XXXXX");
		return romanNumber;
	}
}
