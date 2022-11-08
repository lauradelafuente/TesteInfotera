package com.infotera.bean.ejb;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.infotera.model.Telefone;

@Stateful
public class TelefoneEJB {

	@PersistenceContext
	private EntityManager em;

	public void insert(Telefone telefone) {
		em.persist(telefone);
	}

	public void update(Telefone telefone) {
		em.merge(telefone);
	}

	public void delete(Telefone telefone) {
		System.out.println("Objeto: " + telefone.getId());

		telefone = load(telefone.getId());
		em.remove(telefone);
	}

	public Telefone load(Integer id) {
		return em.find(Telefone.class, id);
	}

	public List<Telefone> findAll() {
		return em.createQuery("select e from Telefone e", Telefone.class).getResultList();
	}

}
