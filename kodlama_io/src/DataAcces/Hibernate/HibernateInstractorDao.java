package DataAcces.Hibernate;

import DataAcces.IInstractorDao;
import Entities.Instractor;

public class HibernateInstractorDao implements IInstractorDao {

	@Override
	public void ekle(Instractor instractor) {
		
		System.out.println(" Eðitmen Hibernate Eklendi : " + instractor);
	}

	@Override
	public void sil(int id) {
		System.out.println("Eðitmen Hibernate silindi id : " + id);
		
	}

}
