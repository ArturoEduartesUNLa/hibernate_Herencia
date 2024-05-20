package negocio;

import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	private static ClienteABM clienteABM;
	
	private ClienteABM()
	{
		
	}

	public static ClienteABM getInstance()
	{
		
		if(clienteABM == null)
			clienteABM = new ClienteABM();
		
		return clienteABM;
	}

	public Cliente traer(int idCliente) {

		return ClienteDao.traer(idCliente);
	}
	
	public List<Cliente> traer()
	{
		return ClienteDao.traer();
	}
}
