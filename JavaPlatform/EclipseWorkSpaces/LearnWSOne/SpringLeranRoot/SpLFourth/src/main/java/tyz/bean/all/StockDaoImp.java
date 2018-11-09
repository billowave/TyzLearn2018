package tyz.bean.all;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class StockDaoImp extends HibernateDaoSupport implements StockDao {
	
	private SessionFactory sessionFactory;

	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
	}

	public void update(Stock stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Stock stock) {
		getHibernateTemplate().delete(stock);
	}
	
	

	public Stock findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find("from Stock where stockCode=?", stockCode);
		
		return list.size() >= 1 ? (Stock) list.get(0):null;
	}

}
