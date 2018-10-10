package fr.eni.projet.amel.bo;

import fr.eni.projet.amel.dal.dao.TestDao;
import fr.eni.projet.amel.dal.factory.DaoFactory;

public class AppliTestBO {

	public static void main(String[] args) {
		// declaration et instanciation de la DAO
		
				TestDao testDAO = DaoFactory.getTestDao();
				
				// Creer un nouveau test 
				Test test1 = new Test("JAVA","test sur le language de programmation JAVA", 60, 80, 20);
				System.out.println(test1);

	}

}
