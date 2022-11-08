package com.infotera.bean.jsf;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotera.bean.ejb.ClienteEJB;
import com.infotera.model.Cliente;

@Named
@RequestScoped
public class ClienteBean {

	@EJB
	private ClienteEJB clienteEJB;

	private Cliente cliente;

	public String inserir() {
		clienteEJB.insert(cliente);
		return null;
	}

	public String alterar() {
		clienteEJB.update(cliente);
		return null;
	}

	public String apagar() {
		clienteEJB.delete(cliente);
		return null;
	}

	public String novo() {
		cliente = new Cliente();
		return null;
	}

	public Cliente getCliente() {

		if (cliente == null) {
			cliente = new Cliente();
		}
		return cliente;
	}

}
