package es.curso.controllers.ejb;

import java.util.ArrayList;

import es.curso.controllers.ListarTodosController;
import es.curso.model.Entity.Cliente;
import es.curso.persistence.model.daos.jdbc.ClienteDaoJdbc;

public class ListarTodosControllerEjb implements ListarTodosController{

	@Override
	public ArrayList<Cliente> listarTodos() {
		ClienteDaoJdbc daoCliente = new ClienteDaoJdbc();
		ArrayList<Cliente> clientes= daoCliente.findAll();
		//mas instrucciones
		
		return clientes;
	}

}
