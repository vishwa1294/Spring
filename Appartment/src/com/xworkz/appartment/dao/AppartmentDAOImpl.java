package com.xworkz.appartment.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.apartment.entity.ApartmentEntity;

public class AppartmentDAOImpl implements AppartmentDAO{
private static SessionFactory factory;
public AppartmentDAOImpl() {
	super();
	System.out.println(this.getClass().getSimpleName()+"bean created");
}
	public void setAppartmentEntity(AppartmentEntity flat) {
		Session session =null;
		try {session=factory.openSession();
		session.beginTransaction();
		session.save(flat);
		session.getTransaction().commit();
			
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally {
			if(session !=null) {
				session.close();
			}
		}
	}

}
