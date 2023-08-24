package com.curso.sistemareclamos.service;

import java.util.List;

import com.curso.sistemareclamos.bo.Reclamo;

public interface ReclamosService {

	Long crearNuevoReclamo(Reclamo reclamo);

	Reclamo recuperarReclamoPorId(Long id);

	List<Reclamo> recuperarTodoLosReclamos();
	
	void borrarReclamo(Long id);
	
	void actualizarReclamo(Reclamo reclamo);
}
