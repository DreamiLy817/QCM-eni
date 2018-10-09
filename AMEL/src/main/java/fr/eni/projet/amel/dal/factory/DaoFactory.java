package fr.eni.projet.amel.dal.factory;

import fr.eni.projet.amel.dal.dao.TestDao;
import fr.eni.projet.amel.dal.dao.impl.TestDaoImpl;
import fr.eni.projet.amel.dal.dao.PropositionDao;
import fr.eni.projet.amel.dal.dao.QuestionDao;
import fr.eni.projet.amel.dal.dao.impl.PropositionDaoImpl;
import fr.eni.projet.amel.dal.dao.impl.QuestionDaoImpl;

public class DaoFactory {
	
	public static TestDao getTestDao() {
		TestDao testDAO = new TestDaoImpl();
		return testDAO;
	}

	public static PropositionDao propositionDAO() {
		return PropositionDaoImpl.getInstance();
	}
	 
 	public static QuestionDao questionDAO() {
		return QuestionDaoImpl.getInstance();
	}
}
