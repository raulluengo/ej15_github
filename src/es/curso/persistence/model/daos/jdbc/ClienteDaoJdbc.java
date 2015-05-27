package es.curso.persistence.model.daos.jdbc;

import java.util.ArrayList;

import es.curso.model.Entity.Cliente;
import es.curso.persistence.model.daos.ClienteDao;

public class ClienteDaoJdbc implements ClienteDao{

	@Override
	public void create(Cliente cliente) {
		//instrucciones para conectar con la base de datos
		// preparar la sentencia (sql) para agregar
		// ejecutar la sentencia (sql) 
		// cerrar la conexion
		
	}

	@Override
	public ArrayList<Cliente> findAll() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente(1, "Jose", "Pérez", "111111"));
		clientes.add(new Cliente(2, "Maria", "Caceres", "222222"));
		clientes.add(new Cliente(3, "Ana", "Sanchez", "333333"));
		clientes.add(new Cliente(4, "Jose Miguel", "Ruiz", "444444"));
		clientes.add(new Cliente(5, "Jose Luis", "Saenz", "555555"));
		clientes.add(new Cliente(6, "Jose Maria", "Gonzalez", "123456"));
		clientes.add(new Cliente(7, "Jose Fernando", "Hernandez ", "77776"));
		clientes.add(new Cliente(8, "Mariano", "Barcenas", "188886"));
		clientes.add(new Cliente(9, "Manuel", "Iglesias", "199999"));
		clientes.add(new Cliente(10, "Raul", "Jimenez", "123456"));
		return clientes;
	}

}
