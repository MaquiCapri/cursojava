package com.curso.sistemareclamos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SistemaReclamosApplication implements CommandLineRunner{
		
	//@Autowired
	//private ClientesRepository clientesRepository;

	//@Autowired
	//private EsatdoReclamoRepository estadoReclamoRepository;
	
	//@Autowired
	//private ReclamoRepository reclamosRepository;
	public static void main(String[] args) {
		SpringApplication.run(SistemaReclamosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
	
		//Cliente cliente1 = new Cliente();
		//cliente1.setNombre("pedro lopez");
		
		//clientesRepository.save(cliente1);
	//	System.out.println("Id cliente generado: " + cliente1.getId());
		
		//List<Cliente> clientes = clientesRepository.buscarTodosLosClientes();
		//for (Cliente c : clientes) {
	//		System.out.println(c.getId() + " " + c.getNombre());
	//	}
		
		//System.out.println("*********************");
		
	//	List<Cliente> clientesPorNombreLike = clientesRepository.buscarClientesPorNombreLike("lopez");
		
		//for (Cliente c : clientesPorNombreLike) {
		//	System.out.println(c.getId() + " " + c.getNombre());
		//}
		
		//EstadoReclamo estadoReclamo1 = new EstadoReclamo();
		//estadoReclamo1.setNombre("Nuevo");

		//EstadoReclamo estadoReclamo2 = new EstadoReclamo();
		//estadoReclamo2.setNombre("Pendiente");

		//EstadoReclamo estadoReclamo3 = new EstadoReclamo();
		//estadoReclamo3.setNombre("Cerrado");
		
		
		//estadoReclamoRepository.save(estadoReclamo1);
		//estadoReclamoRepository.save(estadoReclamo2);
		//estadoReclamoRepository.save(estadoReclamo3);
		
		
		//Cliente cliente1 = new Cliente();
		//cliente1.setNombre("pedro lopez");
		//clientesRepository.save(cliente1);
		//System.out.println("Id cliente generado: " + cliente1.getId());
		

		//Reclamo reclamo1 = new Reclamo();
		//reclamo1.setTitulo("Reclamo 1");
		//reclamo1.setDescripcion("Ejemplo 12345 Ejemplo 12345");
		//reclamo1.setEstadoReclamo(estadoReclamo1);
		//reclamo1.setFechaDeAlta(new Date());
		
		//reclamosRepository.save(reclamo1);
		
	//	cliente1.getReclamos().add(reclamo1);
	//	clientesRepository.save(cliente1);
  }
}
