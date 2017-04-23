package machine;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/*
 * If you dont know the romannumbersystem well then just use a simple converter like this to write tests
 * http://www.calculateme.com/cRomanNumerals/ArabicNumeralsToRoman.htm
 */

public class ArabicToRomanNumbersConverterTest {
	private ArabicToRomanNumbersConverter arabicToRomanNumbersConverter = new ArabicToRomanNumbersConverter();

	@Test
	public void testArabicNumberOneToRomanNumberConversion() throws Exception {
		assertThat(arabicToRomanNumbersConverter.convert(1), is("I"));
	}

	@Test
	public void testArabicNumberFiveToRomanNumberConversion() throws Exception {
		assertThat(arabicToRomanNumbersConverter.convert(5), is("V"));
	}

	@Test
	public void testArabicNumberTenToRomanNumberConversion() throws Exception {
		assertThat(arabicToRomanNumbersConverter.convert(10), is("X"));
	}

	@Test
	public void testArabicNumberElevenToRomanNumberConversion() throws Exception {
		assertThat(arabicToRomanNumbersConverter.convert(11), is("XI"));
	}

	@Test
	public void testArabicNumberTwelveToRomanNumberConversion() throws Exception {
		assertThat(arabicToRomanNumbersConverter.convert(12), is("XII"));
	}
}
