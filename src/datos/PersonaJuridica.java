package datos;

public class PersonaJuridica extends Cliente {
	private String razonSocial;
	private String cuit;

	private PersonaJuridica() {

	}

	public PersonaJuridica(String razonSocial, String cuit) {
		super();
		this.razonSocial = razonSocial;
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public String toString() {
		return "PersonaJuridica [" + super.toString() + ", razonSocial=" + razonSocial + ", cuit=" + cuit + "]\n";
	}

}
