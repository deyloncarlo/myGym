package br.com.myGym.model.dao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe utilizada para gerenciar a criação de EntityManager
 * 
 * @author Deylon
 *
 */
public class JPAUtil
{
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myGym");

	/**
	 * Método que cira EntityManeger
	 * 
	 * @return EntityManager
	 */
	public EntityManager getEntityManager()
	{
		return emf.createEntityManager();
	}
}
