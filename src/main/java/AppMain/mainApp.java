package AppMain;

import java.sql.SQLException;

import Controllers.ClienteReadController;
import DB_Connection.Ej1;
import Model.Cliente;
import Views.ClienteViewRead;

public class mainApp {

	public static void main(String[] args) throws SQLException {
		//Crea la base de datos y crea la tabla e inserciones
		Ej1 ej1 = new Ej1(); 
		//
	    Cliente cliente = new Cliente();
	    ClienteViewRead clienteViewRead = new ClienteViewRead();
	    ClienteReadController readController = new ClienteReadController(cliente, clienteViewRead);
	    readController.iniciarVista();
	    clienteViewRead.setVisible(true);
	    
	}


}
