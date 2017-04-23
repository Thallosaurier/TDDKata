package machine;

import org.junit.Assert;
import org.junit.Test;

/*
 * If you dont know the romannumbersystem well then just use a simple converter like this to write tests
 * http://www.calculateme.com/cRomanNumerals/ArabicNumeralsToRoman.htm
 */

public class ArabicToRomanNumbersConverterTest {
	private ArabicToRomanNumbersConverter arabicToRomanNumbersConverter = new ArabicToRomanNumbersConverter();

	@Test
	public void testArabicNumberElevenToRomanNumberConversion() throws Exception {
		Assert.assertEquals("XI", arabicToRomanNumbersConverter.convert(11));
	}

	@Test
	public void testArabicNumberTwelveToRomanNumberConversion() throws Exception {
		Assert.assertEquals("XII", arabicToRomanNumbersConverter.convert(11));
	}
}
