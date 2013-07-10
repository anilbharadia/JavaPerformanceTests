import org.apache.commons.lang.StringUtils;


public class TestTest {

	public static void main(String[] args) {
		int i = 75;
		String out = StringUtils.leftPad(String.valueOf(i), 3, "0");
		System.out.println(out);
	}
	
}
