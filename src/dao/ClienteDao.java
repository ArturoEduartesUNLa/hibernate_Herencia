package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Cliente;

public class ClienteDao {
	private static Session session;
	private static Transaction tx;

	private ClienteDao() {

	}

	private static void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private static void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	// ------------ ABM ------------
	public static int agregar(Cliente c) {
		int idC = 0;
		try {
			iniciaOperacion();
			idC = (int) session.save(c);
			tx.commit();

		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return idC;
	}

	// ----------- Querys ------------
	public static Cliente traer(int idCliente) {
		Cliente objeto = null;
		try {

			iniciaOperacion();
			objeto = (Cliente) session.createQuery("from Cliente c where c.idCliente=:idCliente")
					.setParameter("idCliente", idCliente).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

	public static List<Cliente> traer() throws HibernateException {
		List<Cliente> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Cliente", Cliente.class).list();
		} finally {
			session.close();
		}
		return lista;
	}

}
