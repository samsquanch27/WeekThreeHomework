
public class SpacedLogger implements Logger{
	public void Log (String x) {
		char[] chars = x.toCharArray();
		for (int i = 0 ; i < x.length(); i++) {
			if (i == x.length() - 1) {
				System.out.println(chars[i]);
			}
			else {
				System.out.print(chars[i] + " ");
			}
		}
	}
	public void Error (String y) {
		System.out.print("ERROR: ");
		Log(y);
	}
}
