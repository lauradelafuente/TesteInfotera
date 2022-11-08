package com.infotera.bean.jsf;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotera.bean.ejb.TelefoneEJB;
import com.infotera.model.Telefone;

@Named
@SessionScoped
public class TelefoneBean {

	@EJB
	private TelefoneEJB telefoneEJB;

	private Telefone telefone;

	private Integer idBuscar;

	private List<Telefone> telefones;

	@PostConstruct
	public void init() {
		telefones = telefoneEJB.findAll();
	}

	public String inserir() {
		telefoneEJB.insert(telefone);
		return null;
	}

	public String alterar() {
		telefoneEJB.update(telefone);
		return null;
	}

	public String apagar() {
		telefoneEJB.delete(telefone);
		return null;
	}

	public String buscaId() {
		telefone = telefoneEJB.load(idBuscar);
		return null;
	}

	public String novo() {
		telefone = new Telefone();
		return null;
	}

	public Telefone getTelefone() {

		if (telefone == null) {
			telefone = new Telefone();
		}
		return telefone;
	}

	public Integer getIdBuscar() {
		return idBuscar;
	}

	public void setIdBuscar(Integer idBuscar) {
		this.idBuscar = idBuscar;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
