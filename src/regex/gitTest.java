package regex;

public class gitTest {
	public static void main(String args[]) {
		try {
			String arr[] = new String[10];
			arr = null;
			arr[0] = "one";
			System.out.print(arr[0]);
		} catch (Exception ex) {
			System.out.print("exception");
		} catch (NullPointerException nex) {
			System.out.print("null pointer exception");
		}
		"teste".split("\s");
	}
	
}
