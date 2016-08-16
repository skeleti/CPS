package com.cps.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.cps.dao.ILoginDao;
import com.cps.dao.util.EntityManagerUtil;
import com.cps.entity.UserDetails;

public class LoginDao implements ILoginDao {

	@Override
	public void createUser(UserDetails user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(UserDetails user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDetails getUserDetails(String userName, String password) {
		
		UserDetails userDetails = new UserDetails();
		try {
			EntityManager em = EntityManagerUtil.getEntityManager();
			Query query = em.createQuery("select u from UserDetails u where u.userName='"+userName+"' and u.password='"+password+"'");
			userDetails =(UserDetails) query.getSingleResult();
			
		} catch (NoResultException ne) {
			return null;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return userDetails;
	}

}
