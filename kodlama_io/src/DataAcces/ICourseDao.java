package DataAcces;

import Entities.Course;

public interface ICourseDao {

	void ekle(Course course);
	
	void sil(int id);
	
}
