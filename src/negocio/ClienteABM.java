package negocio;

import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	private static ClienteABM clienteABM;

	private ClienteABM() {

	}

	public static ClienteABM getInstance() {

		if (clienteABM == null)
			clienteABM = new ClienteABM();

		return clienteABM;
	}

	// ----- ABM ----------
	public int agregar(Cliente c) {
		return ClienteDao.agregar(c);
	}

	// ------- Querys -------
	public Cliente traer(int idCliente) {

		return ClienteDao.traer(idCliente);
	}

	public List<Cliente> traer() {
		return ClienteDao.traer();
	}
}
