import Bussines.CategoryManager;
import Bussines.CourseManager;
import Bussines.InstractorManager;
import DataAcces.IInstractorDao;
import DataAcces.Hibernate.HibernateCourseDaO;
import DataAcces.Jdbc.JdbcCategoryDao;
import DataAcces.Jdbc.JdbcInstractorDao;
import Entities.Category;
import Entities.Course;
import Entities.Instractor;
import Logging.DataBaseLogger;
import Logging.FileLogger;
import Logging.ILogger;
import Logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
	
	ILogger[] logger = {new DataBaseLogger(), new MailLogger(), new FileLogger()};
	
	
	//category 
	
	Category[] categories = {new Category(1,"Yapay Zeka"), new Category(2,"web Kodlama")};
	
	CategoryManager categorymanager= new CategoryManager(categories,logger,new JdbcCategoryDao());
	
	for(Category category: categories) {
		categorymanager.add(category);
	}
	
	//Course 
	
	Course[] courses= {new Course(1,"java",50), new Course(2,"pyhton",150) };
	CourseManager coursemanager = new CourseManager(new HibernateCourseDaO(),courses, logger);
	
	for(Course course: courses) {
		coursemanager.Add(course);
	}
	

	//Instractor 
	

	Instractor[] instractors= {new Instractor(1,"engin","demiroð"), new Instractor(2,"salih","atmacalar") };
	InstractorManager instractormanager = new InstractorManager(instractors,logger, new JdbcInstractorDao());
	
	for(Instractor instractor: instractors) {
		instractormanager.add(instractor);
		
	}
	
	
	
	
	
	}

}
