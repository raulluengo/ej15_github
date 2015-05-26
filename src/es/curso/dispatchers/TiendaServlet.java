package es.curso.dispatchers;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.controllers.ejb.DarAltaClienteControllerEjb;
import es.curso.model.Entity.Cliente;


@WebServlet("/Tienda/*")  //con esto recibimos varias peticiones, necesario para la ruta
public class TiendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TiendaServlet() {
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//extaigo la peticion get
		//busco una, dependiendo el substring de su url(1), y invoco al controlador adecuado
		String action = request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		switch(action){
		case "listarTodos":
		  //se invocara el controlador adecuado, redirige a otra pagina para obtener todos los clientes
		break;
		case "buscarPorNombre":
		  //se invoca controlador adecuado, redirige a otra pagina para obtener los clientes por el criterio de busqueda
		break;
		}
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		switch(action){
		case "altaCliente":
			//recuperar los datos del cliente del formulario
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String dni = request.getParameter("dni");
			Cliente cliente = new Cliente(0, nombre, apellido, dni);
		  //se invocara el controlador adecuado, redirige a otra pagina para dar de alta un cliente
			
			DarAltaClienteControllerEjb controlador= new DarAltaClienteControllerEjb();
			controlador.agregar(cliente);
		break;
		
		}
	}

}
