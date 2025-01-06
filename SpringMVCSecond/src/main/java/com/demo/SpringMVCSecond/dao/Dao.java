package com.demo.SpringMVCSecond.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringMVCSecond.beans.User;


@Repository
public interface Dao extends JpaRepository<User, Integer>{

}
