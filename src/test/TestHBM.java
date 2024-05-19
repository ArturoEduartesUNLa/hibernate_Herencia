package test;

import dao.HibernateUtil;

public class TestHBM {

	public static void main(String[] args) {
		// probar conexion
		System.out.println(
				"Conexion database " + HibernateUtil.getSessionFactory().openSession().beginTransaction().isActive());

		HibernateUtil.getSessionFactory().openSession().close();
	}
	

}
