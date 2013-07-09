package org.rw.performance;

import org.apache.commons.lang.StringUtils;


/**
 * @author anil.bharadia
 *
 */
public class StringUtilsVsStringFormat {

	private static final int INPUT = 1;
	private static final int LOOP = 5000;
	private static final int PADS = 10;
	private static final String PAD_CHAR = "0";
	//private static 
	
	public static void main(String[] args) {
		
		System.out.println("input = " + INPUT);
		System.out.println("loop = " + LOOP);
		System.out.println("pad count = " + PADS);
		System.out.println("pad character = " + PAD_CHAR);
		
		long time = testStringUtils();
		long time2 = testStringFormat();
		
		System.out.println("String Utils took : " + time);
		System.out.println("StringFormat took : " + time2);
		
		
	}
	
	
	private static long testStringUtils() {
		long startTime = System.currentTimeMillis();
		
		String input = String.valueOf(INPUT);
		
		System.out.println("StringUtils o/p = " + StringUtils.leftPad(input, PADS, PAD_CHAR));
		
		for (int i=0; i<LOOP; i++) {
			StringUtils.leftPad(input, PADS, PAD_CHAR);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	
	private static long testStringFormat() {
		long startTime = System.currentTimeMillis();
		
		String format = "%" + PAD_CHAR + String.valueOf(PADS) + "d";
		System.out.println("StringFormat = " + format);
		System.out.println("StringFormat o/p = " + String.format(format, INPUT));
		
		for (int i=0; i<LOOP; i++) {
			String.format(format, INPUT);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
}
