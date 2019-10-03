package com.ab.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ab.model.WebServiceModel;

@Repository
public class RegistrationRepository {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * @Autowired private HibernateTemplate hibernateTemplate;
	 */

	public void saveRecord(WebServiceModel model) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(model);
	}

	/*
	 * public void saveRecordWithHibernateTemplate(WebServiceModel model) {
	 * hibernateTemplate.save(model); }
	 */
}
