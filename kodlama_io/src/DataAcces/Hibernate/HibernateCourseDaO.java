package DataAcces.Hibernate;

import DataAcces.ICourseDao;
import Entities.Course;

public class HibernateCourseDaO implements ICourseDao {

	@Override
	public void ekle(Course course) {
		System.out.println("Kurs Hibernate Eklendi : " + course);
		
	}

	@Override
	public void sil(int id) {
		System.out.println("Kurs Hibernate silindi id : " + id);
		
	}
	
	

}
