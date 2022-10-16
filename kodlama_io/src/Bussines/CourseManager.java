package Bussines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import DataAcces.ICourseDao;
import DataAcces.Hibernate.HibernateCourseDaO;
import Entities.Course;
import Logging.ILogger;

public class CourseManager {
	
	private ICourseDao courseDao;
	
	private Course[] courses;
	private ILogger [] logger;
	
	public  CourseManager(ICourseDao courseDao,Course[] courses, ILogger[] logger){
		this.courseDao=courseDao;
		this.courses=courses;
		this.logger=logger;
		
		
		
	}
	
	

	public void Add(Course course) throws Exception {
		
	/*	 for(Course course1 : courses) {
			 
			 if(course1.getName().equals(course.getName())) {
				 
				 throw new Exception("Eklediðiniz kurs zaten mevcut!");
			 }
			 
			 
			 if(course1.getUnitPrice() <0) {
				 throw new Exception("Kurs ücreti 0 altýnda olamaz!");
			 }
			 
			 
			 
		 }
		*/
		
		 
		 for(ILogger logger: logger) {
			 logger.log(course.getName());
		 }
		 
		 courseDao.ekle(course);
	}
	
	
	   public void Sil(Course course)
	   {
		   courseDao.sil(course.getId());
	   }
	

}
