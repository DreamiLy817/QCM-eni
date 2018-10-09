package fr.eni.projet.amel.dal.factory;


import fr.eni.projet.amel.dal.dao.TestDao;
import fr.eni.projet.amel.dal.dao.impl.TestDaoImpl;

public class DaoFactory {
	
	public static TestDao getTestDao() {
		TestDao testDAO = new TestDaoImpl();
		return testDAO;
	}

}
