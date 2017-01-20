package com.luoluo.crud;

import com.luoluo.bean.Person;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.junit.Test;


/**
 * Created by luozhiyun on 17/1/20.
 */
public class PersonDao {

	@Test
	public void testSavePerson() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person p = new Person();
		p.setName("aaa");
		p.setDescription("AAA");

		session.save(p);
		transaction.commit();
		session.close();
	}

	@Test
	public void updatePerson() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person person = (Person) session.get(Person.class, 1L);
		person.setDescription("sfsfdsd");

		session.update(person);
		transaction.commit();
		session.close();
	}
	@Test
	public void getPersonById() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person person = (Person) session.get(Person.class, 1L);
		System.out.println(person.getName());

		transaction.commit();
		session.close();

	}
	@Test
	public void delete() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();


		Person person = (Person) session.get(Person.class, 1L);
		session.delete(person);

		transaction.commit();
		session.close();
	}
}
