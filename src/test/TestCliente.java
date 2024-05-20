package test;

import datos.PersonaFisica;
import datos.PersonaJuridica;
import negocio.ClienteABM;

public class TestCliente {

	public static void main(String[] args) {
		System.out.println("test Cliente");

		int idcliente = 1;
		System.out.printf("\nUC 1  traer(%d) \n %s", idcliente, ClienteABM.getInstance().traer(idcliente));

		idcliente = 2;
		System.out.printf("\nUC 2  traer(%d) \n %s", idcliente, ClienteABM.getInstance().traer(idcliente));

		System.out.println("Traer todos");
		System.out.println(ClienteABM.getInstance().traer());

		// agregar
		PersonaFisica pf = new PersonaFisica("123456789", "nuevo Apellido", "nuevo nombre", 123456789);
		System.out.println(
				"agregar una personaFisica\n" + ClienteABM.getInstance().traer(ClienteABM.getInstance().agregar(pf)));

		// agregar
		PersonaJuridica pj = new PersonaJuridica("987654321", "Nueva RazonSocial", "20123457892");
		System.out.println(
				"agregar una personaJuridica\n" + ClienteABM.getInstance().traer(ClienteABM.getInstance().agregar(pj)));

	}

}
