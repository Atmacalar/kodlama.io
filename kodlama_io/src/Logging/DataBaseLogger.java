package Logging;

public class DataBaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Logland�: Database  " + data);
		
	}

}
