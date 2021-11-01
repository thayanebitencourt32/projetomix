package br.com.projectthayane.avaliacao.entity;

public class DocumentoDto {
	
	private String nome;
	private String atividade;
	private String link;
	private Double qtdHoras;
	private String statusDocumentos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getStatusDocumentos() {
		return statusDocumentos;
	}
	public void setStatusDocumentos(String statusDocumentos) {
		this.statusDocumentos = statusDocumentos;
	}
	public Double getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(Double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
	
	
	

}
