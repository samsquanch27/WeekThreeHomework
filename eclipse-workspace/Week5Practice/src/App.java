
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "test";
		
		AsteriskLogger aLog = new AsteriskLogger();
		aLog.Log(i);
		aLog.Error(i);
		
		SpacedLogger sLog = new SpacedLogger();
		sLog.Log(i);
		sLog.Error(i);
	}

}
