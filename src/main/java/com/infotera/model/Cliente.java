package com.infotera.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "cliente")

public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "O atributo nome é obrigatório!")
	private String nome;

	@NotBlank(message = "O atributo email é obrigatório!")
	private String email;

	@NotBlank(message = "O atributo cep é obrigatório!")
	private Integer cep;

	@NotBlank(message = "O atributo endereço é obrigatório!")
	private String endereco;

	@NotBlank(message = "O atributo bairro é obrigatório!")
	private String bairro;

	private String complemento;

	@NotBlank(message = "O atributo cidade é obrigatório!")
	private String cidade;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Telefone telefone;

	public Cliente(Integer id, String nome, String email, Integer cep, String endereco, String bairro,
			String complemento, String cidade, Telefone telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cep = cep;
		this.endereco = endereco;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Cliente() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
