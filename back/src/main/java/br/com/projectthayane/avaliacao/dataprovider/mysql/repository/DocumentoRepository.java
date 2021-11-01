package br.com.projectthayane.avaliacao.dataprovider.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projectthayane.avaliacao.dataprovider.mysql.entity.Documento;



public interface DocumentoRepository extends JpaRepository<Documento,Long>{

}
