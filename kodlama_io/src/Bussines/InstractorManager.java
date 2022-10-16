package Bussines;

import java.util.ArrayList;

import DataAcces.IInstractorDao;
import Entities.Instractor;
import Logging.ILogger;

public class InstractorManager {

	private IInstractorDao instractorDao;
	private Instractor[] instractor;
	private ILogger[] logger;
	
	public InstractorManager(Instractor[] instractor, ILogger[] logger,IInstractorDao instractorDao)
	{
		this.instractor=instractor;
		this.logger=logger;
		this.instractorDao=instractorDao;
		
		
	}
	
	
	public void add(Instractor instractor)
	{
		instractorDao.ekle(instractor);
		
		 for(ILogger logger: logger) {
			 logger.log(instractor.getName());
		 }
		
	}
	
	
	
	
	public void delete(Instractor instractor) {
		instractorDao.sil(instractor.getId());
	}
	
	
	
}
