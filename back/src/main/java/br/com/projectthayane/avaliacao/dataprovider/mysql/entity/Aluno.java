package br.com.projectthayane.avaliacao.dataprovider.mysql.entity;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.projectthayane.avaliacao.entity.AlunoDto;

@Entity

public class Aluno {
	@Id
	private Long id;
	private String nome;
	private String matricula;
	@OneToMany(mappedBy = "aluno",cascade = CascadeType.ALL)
	private List<Documento> documentos;
	
	
	public AlunoDto toDto() {
		var aluno = new AlunoDto();
		aluno.setNomeAluno(nome);
		aluno.setMatriculaAluno(matricula);
		aluno.setDocumentos(documentos.stream().map(doc->doc.toDto())
				.collect(Collectors.toList()));
		
		return aluno;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public List<Documento> getDocumentos() {
		return documentos;
	}



	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
	

}
