package Logging;

public class DataBaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Loglandý: Database  " + data);
		
	}

}
