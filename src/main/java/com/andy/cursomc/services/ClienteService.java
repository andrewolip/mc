package com.andy.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.andy.cursomc.domain.Cliente;
import com.andy.cursomc.repositories.ClienteRepository;
import com.andy.cursomc.services.exceptions.ObjectNotFoundException;

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id) {
		Cliente cliente = clienteRepository.findOne(id);
		
		if(cliente == null)
			throw new ObjectNotFoundException("Objeto nao encontrado! ID: " + id + " , TIPO: " + Cliente.class.getName());
		
		return cliente;
	}
}