package Logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
	System.out.println("logland�: File " + data);
		
	}

}
