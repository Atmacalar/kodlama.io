package DataAcces.Hibernate;

import DataAcces.ICategoryDao;
import Entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void ekle(Category category) {
		System.out.println("Kategori Hibernate Eklendi : " + category);
		
	}

	@Override
	public void sil(int id) {
		System.out.println("kategori Hibernate silindi id  : " + id);
		
	}

}
