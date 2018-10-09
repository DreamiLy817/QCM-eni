package fr.eni.projet.amel.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.amel.bo.Epreuve;
import fr.eni.projet.amel.bo.QuestionTirage;
import fr.eni.projet.amel.dal.dao.impl.QuestionTirageDAOImpl;
import fr.eni.tp.web.common.dal.dao.GenericDAO;
import fr.eni.tp.web.common.dal.exception.DaoException;

public class QuestionTirageDAO implements QuestionTirageDAOImpl{

	private static final String insert 	= "INSERT INTO QUESTION_TIRAGE (estMarquee, idQuestion, numordre, idEpreuve) VALUES (?, ?, ?, ?)";
	
	@Override
	public Object insert(Object element) throws DaoException {
		
		Connection cnx=null;
		PreparedStatement rqt=null;
		QuestionTirage tirage = (QuestionTirage)element;
		
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement(insert);
			rqt.setBoolean(1, tirage.isEstmarqué());
			rqt.setInt(2,tirage.getQuestion().getIdQuestion());
			rqt.setInt(3, tirage.getNumordre());
			rqt.setInt(4, tirage.getEpreuve().getIdEpreuve());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}

	@Override
	public void update(Object element) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object id) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object selectById(Object id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List selectAll() throws DaoException {
		return null;
	}
	
	

}
