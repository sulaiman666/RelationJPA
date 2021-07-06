package com.solo.latihanjpadewa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.solo.latihanjpadewa.entity.Students;

public interface StudentsRepository extends CrudRepository<Students, Long>{
	public Students findByName(String name);
}
