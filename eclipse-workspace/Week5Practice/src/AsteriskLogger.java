
public class AsteriskLogger implements Logger{
	public void Log (String x) {
		System.out.println("***" + x + "***");
	}
	public void Error (String y ) {
		System.out.println("**************");
		System.out.println("*** ERROR: " + y + "***");
		System.out.println("**************");
	}
}
