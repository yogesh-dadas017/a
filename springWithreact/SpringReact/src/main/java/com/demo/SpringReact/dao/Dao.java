package com.demo.SpringReact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringReact.beans.User;

@Repository
public interface Dao extends JpaRepository<User, Integer>{

}
