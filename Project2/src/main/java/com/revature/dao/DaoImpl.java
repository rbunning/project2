package com.revature.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.ScrumUser;
import com.revature.beans.Task;

@Repository
public class DaoImpl implements Dao {
	@Autowired
	SessionFactory sessionFactory;

	// Get an Existing Scrum User from the DB
	@Transactional
	@Override
	public ScrumUser getScrumUserById(ScrumUser sUser) {
		Session session = sessionFactory.getCurrentSession();
		ScrumUser dbUser = (ScrumUser) session.get(ScrumUser.class, sUser.getScrumUserId());
		return dbUser;
	}

	// Get an Existing Scrum User from the DB (used for login)
	@Transactional
	@Override
	public ScrumUser getScrumUserByUsername(ScrumUser sUser) {
		Session session = sessionFactory.getCurrentSession();
		ScrumUser dbUser = (ScrumUser) session.createCriteria(ScrumUser.class)
				.add(Restrictions.eq("scrumUserUsername", sUser.getScrumUserUsername())).uniqueResult();
		return dbUser;
	}

	// Create a new Task and Save it to the DB
	@Transactional
	@Override
	public void createTask(Task t) {
		sessionFactory.getCurrentSession().save(t);
	}

	// Get an Existing Task from the DB
	// Can delete this if not needed
	@Transactional
	@Override
	public Task getTaskById(Task t) {
		Session session = sessionFactory.getCurrentSession();
		Task dbTask = (Task) session.get(Task.class, t.getTaskId());
		return dbTask;
	}
}
