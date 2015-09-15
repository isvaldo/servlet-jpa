package br.infnet.prova.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.infnet.prova.model.Funcionario;

public class DAOFuncionario {
	
	private EntityManager manager;

	public DAOFuncionario() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banco");
		manager = entityManagerFactory.createEntityManager();
	}
	
	public void insertFuncionario(Funcionario funcionario){
		manager.getTransaction().begin();
		manager.persist(funcionario);
		manager.getTransaction().commit();
		manager.close();
	}
	
}
