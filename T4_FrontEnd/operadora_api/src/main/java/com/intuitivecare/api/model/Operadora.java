package com.intuitivecare.api.model;

public class Operadora {
	
	private String registroANS;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String modalidade;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String ddd;
	private String telefone;
	private String fax;
	private String enderecoEletronico;
	private String representante;
	private String cargoRepresentante;
	private String dataRegistroANS;

	public Operadora(String registroANS, String cnpj, String razaoSocial, String nomeFantasia, String modalidade,
			String logradouro, String numero, String complemento, String bairro, String cidade, String uf, String cep,
			String ddd, String telefone, String fax, String enderecoEletronico, String representante,
			String cargoRepresentante, String dataRegistroANS) {
		super();
		this.registroANS = registroANS;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.modalidade = modalidade;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.ddd = ddd;
		this.telefone = telefone;
		this.fax = fax;
		this.enderecoEletronico = enderecoEletronico;
		this.representante = representante;
		this.cargoRepresentante = cargoRepresentante;
		this.dataRegistroANS = dataRegistroANS;
	}

	public String getRegistroANS() {
		return registroANS;
	}

	public void setRegistroANS(String registroANS) {
		this.registroANS = registroANS;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEnderecoEletronico() {
		return enderecoEletronico;
	}

	public void setEnderecoEletronico(String enderecoEletronico) {
		this.enderecoEletronico = enderecoEletronico;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getCargoRepresentante() {
		return cargoRepresentante;
	}

	public void setCargoRepresentante(String cargoRepresentante) {
		this.cargoRepresentante = cargoRepresentante;
	}

	public String getDataRegistroANS() {
		return dataRegistroANS;
	}

	public void setDataRegistroANS(String dataRegistroANS) {
		this.dataRegistroANS = dataRegistroANS;
	}

	@Override
	public String toString() {
		return "Operadora [registroANS=" + registroANS + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial
				+ ", nomeFantasia=" + nomeFantasia + ", modalidade=" + modalidade + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", cep=" + cep + ", ddd=" + ddd + ", telefone=" + telefone + ", fax=" + fax
				+ ", enderecoEletronico=" + enderecoEletronico + ", representante=" + representante
				+ ", cargoRepresentante=" + cargoRepresentante + ", dataRegistroANS=" + dataRegistroANS + "]";
	}
	
}
