package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Models;
import com.userDao.UserDao;

@Service
public class Services implements IServices{

	@Autowired
	UserDao userdao;
	
	@Override
	public String Insert(Models models) {
		try {
		Models m=userdao.save(models);
		if(m!=null) {
			return "Done";
		}
		else {
			return "Error";
		}
		}catch(Exception e) {
			System.out.println(e);
			return "Error";
		}
	}
}
