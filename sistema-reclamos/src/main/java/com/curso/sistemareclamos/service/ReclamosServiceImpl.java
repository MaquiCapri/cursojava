package com.curso.sistemareclamos.service;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.curso.sistemareclamos.bo.Reclamo;

import com.curso.sistemareclamos.repository.ReclamoRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReclamosServiceImpl implements ReclamosService{

	@Autowired
	private ReclamoRepository reclamosRepository;
	
	@Override
	public void borrarReclamo(Long id) {
		reclamosRepository.deleteById(id);
	}

	@Override
	public Long crearNuevoReclamo(Reclamo reclamo) {
		reclamo.setFechaDeAlta(new Date());
		//reclamo.setEstadoReclamo(null); //TODO: Asignar el estado inicial....
		reclamosRepository.save(reclamo);
		return reclamo.getId();
	}
	
	@Override
	public Reclamo recuperarReclamoPorId(Long id) {
		return reclamosRepository.findById(id).get();
	}
	
	@Override
	public List<Reclamo> recuperarTodoLosReclamos() {
		return reclamosRepository.buscarTodosLosReclamos();
	}

	@Override
	public void actualizarReclamo(Reclamo reclamo) {
		reclamosRepository.save(reclamo);
	}
}
