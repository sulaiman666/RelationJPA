package com.solo.latihanjpadewa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.solo.latihanjpadewa.entity.Courses;
import com.solo.latihanjpadewa.entity.Post;

public interface CoursesRepository extends CrudRepository<Courses, Long> {

}
