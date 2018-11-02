package br.com.unibratec.assistencia.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Endereco implements IEntidade{
	
	@Id
	@Column(name="codigo_cliente")
	private Integer id;
	
	@Column
	private String rua;
	
	@Column
	private String cep;
	
	@Column
	private String bairro;
	
	@Column
	private String cidade;
	
	@Column
	private String complemento;
	
	@Column
	private String numero;
	
	@OneToOne(mappedBy="endereco",cascade=CascadeType.ALL)
	private Cliente cliente;
	
	/*
	 * Construtor padr�o
	 */
	public Endereco(){
		super();
	}

	public Endereco(String rua, String cep, String bairro, String cidade, String complemento, String numero, Integer id){
		
		this.setRua(rua);
		this.setBairro(bairro);
		this.setCep(cep);
		this.setCidade(cidade);
		this.setNumero(numero);
		this.setId(id);
		
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Object getChavePrimaria() {
		// TODO Auto-generated method stub
		return null;
	}

}
