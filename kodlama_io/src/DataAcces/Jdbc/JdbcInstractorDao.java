package DataAcces.Jdbc;

import DataAcces.IInstractorDao;
import Entities.Instractor;

public class JdbcInstractorDao implements IInstractorDao {

	@Override
	public void ekle(Instractor instractor) {
        System.out.println("E�itmen jdbc eklendi :"+ instractor); 

		
	}

	@Override
	public void sil(int id) {
        System.out.println("E�itmen jdbc silindi :"+ id); 

		
	}

}
