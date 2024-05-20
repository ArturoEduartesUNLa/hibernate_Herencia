package test;

import negocio.ClienteABM;

public class TestCliente {

	public static void main(String[] args) {
		System.out.println("test Cliente");
		
		int idcliente = 1;
		System.out.printf("\nUC 1  traer(%d) \n %s",idcliente, ClienteABM.getInstance().traer(idcliente));
		
		idcliente = 2;
		System.out.printf("\nUC 2  traer(%d) \n %s",idcliente, ClienteABM.getInstance().traer(idcliente));
		
		System.out.println("Traer todos");
		System.out.println(ClienteABM.getInstance().traer());

	}

}
