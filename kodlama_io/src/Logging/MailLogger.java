package Logging;

public class MailLogger implements ILogger {

	@Override
	public void log(String data ) {
		
		System.out.println("logland? : Mail " +data);
		
	}
	
	

}
