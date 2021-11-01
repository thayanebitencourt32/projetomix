package br.com.projectthayane.avaliacao.dataprovider.mysql.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.projectthayane.avaliacao.entity.DocumentoDto;

@Entity
public class Documento {
	@Id
	private String id;
	private String nome;
	private String tipoAtividade;
	private String link;
	private Double quantidadeHoras;
	private String statusDocumento;
	
	@ManyToOne
	private Aluno aluno;

	
	
	public DocumentoDto toDto() {
		var documento = new DocumentoDto();
		documento.setAtividade(this.tipoAtividade);
		documento.setLink(this.link);
		documento.setQtdHoras(this.quantidadeHoras);
		documento.setStatusDocumentos(statusDocumento);
		documento.setNome(this.nome);
		
		return documento;
		
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public String getStatusDocumento() {
		return statusDocumento;
	}

	public void setStatusDocumento(String statusDocumento) {
		this.statusDocumento = statusDocumento;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
	
	
	

}
