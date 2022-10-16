package DataAcces.Jdbc;

import DataAcces.ICategoryDao;
import Entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void ekle(Category category) {
          System.out.println("Kategori jdbc eklendi :"+ category.getName()); 
		
	}

	@Override
	public void sil(int id) {
		
        System.out.println("Kategori jdbc silindi :"+ id); 

	}

}
