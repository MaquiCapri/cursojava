package com.curso.sistemareclamos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.curso.sistemareclamos.bo.Reclamo;

@Repository
public interface ReclamoRepository extends CrudRepository <Reclamo,Long>{
	@Query(value = "select r from Reclamo r")
	public List<Reclamo> buscarTodosLosReclamos();
}
