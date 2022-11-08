package com.infotera.model;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "telefone")

public class Telefone implements Serializable {

	@Id
	private Integer id;

	@NotBlank(message = "O atributo telefone é obrigatório!")
	private Integer telefone;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Telefone() {
		super();
	}

	public Integer getTelefone() {
		return this.telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
