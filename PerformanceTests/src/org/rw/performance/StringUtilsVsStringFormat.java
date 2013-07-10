package org.rw.performance;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author anil.bharadia
 *
 */
public class StringUtilsVsStringFormat {

	private static final int INPUT = 1;
	private static final int LOOP = 50000;
	private static final int PADS = 10;
	private static final String PAD_CHAR = "0";
	private static final String OUTPUT = "0000000001";
	
	
	@Test
	public void commons_StringUtils() {
		String input = String.valueOf(INPUT);
		
		assertEquals(OUTPUT, StringUtils.leftPad(input, PADS, PAD_CHAR));
		
		for (int i=0; i<LOOP; i++) {
			StringUtils.leftPad(input, PADS, PAD_CHAR);
		}
	}
	
	
	
	@Test
	public void commons_StringUtils_with_String_conversion() {
		
		assertEquals(OUTPUT, StringUtils.leftPad(String.valueOf(INPUT), PADS, PAD_CHAR));
		
		for (int i=0; i<LOOP; i++) {
			String input = String.valueOf(INPUT);
			StringUtils.leftPad(input, PADS, PAD_CHAR);
		}
	}
	

	@Test
	public void String_format() {
		String format = "%" + PAD_CHAR + String.valueOf(PADS) + "d";
		
		assertEquals(OUTPUT, String.format(format, INPUT));
		
		for (int i=0; i<LOOP; i++) {
			String.format(format, INPUT);
		}
	}
	
}
