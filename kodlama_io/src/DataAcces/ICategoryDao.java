package DataAcces;

import Entities.Category;

public interface ICategoryDao {
	
	void ekle(Category category);
	
	void sil(int id);

}
