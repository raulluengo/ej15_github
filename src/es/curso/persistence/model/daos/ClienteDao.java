package es.curso.persistence.model.daos;

import java.util.ArrayList;

import es.curso.model.Entity.Cliente;

public interface ClienteDao {
	
	public void create(Cliente cliente);
	
	public ArrayList<Cliente> findAll();

}
