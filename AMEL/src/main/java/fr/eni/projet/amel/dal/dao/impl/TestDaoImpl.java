package fr.eni.projet.amel.dal.dao.impl;

import java.util.List;

import fr.eni.projet.amel.bo.Test;
import fr.eni.projet.amel.dal.dao.TestDao;
import fr.eni.tp.web.common.dal.exception.DaoException;

//idTest,libelle,description,duree,seuil_haut,seuil_bas
public class TestDaoImpl implements TestDao{
	private static final String INSERT_TEST_QUERY = "INSERT INTO TEST(libelle, description, duree, seuil_haut, seuil_bas) VALUES(?,?,?,?,?)";
	private static final String SELECT_TEST_QUERY = "SELECT idTest, libelle, description, duree, seuil_haut, seuil_bas FROM QUESTION q WHERE q.idQuestion=?";
	private static final String SELECT_ALL_TEST = "SELECT q.idQuestion, q.enonce, q.media, q.points, q.idTheme FROM QUESTION q";
	private static final String UPDATE_TEST_QUERY = "UPDATE QUESTION SET (enonce=? , media=?, points=?, idTheme=?) WHERE idQuestion =? ";
	private static final String DELETE_TEST_QUERY = "DELETE FROM QUESTION WHERE idQuestion =? ";
	
	@Override
	public Test insert(Test element) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Test element) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Test selectById(Integer id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Test> selectAll() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
