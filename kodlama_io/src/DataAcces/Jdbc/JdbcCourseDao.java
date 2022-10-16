package DataAcces.Jdbc;

import DataAcces.ICourseDao;
import Entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void ekle(Course course) {
        System.out.println("Kurs jdbc eklendi :"+ course); 

		
	}

	@Override
	public void sil(int id) {
        System.out.println("Kurs jdbc silindi :"+ id); 

		
	}

}
