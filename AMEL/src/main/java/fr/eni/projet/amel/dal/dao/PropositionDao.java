package fr.eni.projet.amel.dal.dao;

import java.util.List;

import fr.eni.projet.amel.bo.Proposition;
import fr.eni.tp.web.common.dal.dao.GenericDAO;
import fr.eni.tp.web.common.dal.exception.DaoException;

public interface PropositionDao extends GenericDAO<Proposition, Integer> {

	List<Proposition> listePropositionsParQuestion(Integer idQuestion) throws DaoException;
	
}
