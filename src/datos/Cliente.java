package datos;

public abstract class Cliente {
	private int idCliente;
	private String nroCliente;

	protected Cliente() {
	}

	public Cliente(String nroCliente) {
		super();
		this.nroCliente = nroCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	private void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nroCliente=" + nroCliente + "]\n";
	}

}
