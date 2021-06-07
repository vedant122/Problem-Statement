package com.userDao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Models;

@Repository
@Transactional
public interface UserDao extends JpaRepository <Models,Integer>{

}
