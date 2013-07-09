/**
 * 
 */
package org.rw.performance;

import org.junit.Test;

/**
 * @author anil.bharadia
 *
 */
public class StringVsStringBufferVsStringBuilder {

	
	private static final int LOOP = 25000;
	
	
	@Test
	public void string() {
		String str = "";
		for (int i=0; i<LOOP; i++) {
			str += String.valueOf(i);
		}
		
	}
	
	@Test
	public void stringBuffer() {
		StringBuffer str = new StringBuffer("");
		for (int i=0; i<LOOP; i++) {
			str.append(String.valueOf(i));
		}
		str.toString();
	}
	
	
	@Test
	public void stringBuilder() {
		StringBuilder str = new StringBuilder("");
		for (int i=0; i<LOOP; i++) {
			str.append(String.valueOf(i));
		}
		str.toString();
	}
	
	
	
	
}
