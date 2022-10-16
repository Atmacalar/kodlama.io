package Bussines;

import java.util.ArrayList;

import DataAcces.ICategoryDao;
import Entities.Category;
import Entities.Course;
import Logging.ILogger;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	private Category[] categories;
	private ILogger [] logger;
	
	
	public CategoryManager(Category[] categories, ILogger[] logger, ICategoryDao categoryDao)
	{
		this.categories=categories;
		this.logger=logger;
		this.categoryDao=categoryDao;
	}
	
	
	public void add(Category category) throws Exception
	{
		for(Category category1:categories) {
			
			
		//	if(category1.getName().equals(category.getName()))
				
			//	throw new Exception("Kategori Zaten Mevcut");
			
		}
		
		 for(ILogger logger: logger) {
			 logger.log(category.getName());
		 }
		
		categoryDao.ekle(category);
		
	}
	
	
	public void Delete(Category category) {
		
		categoryDao.sil(category.getId());
		
	}

}
