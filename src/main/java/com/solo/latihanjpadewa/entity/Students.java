package com.solo.latihanjpadewa.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "students")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 20)
	private long id;
	@Column(length = 11)
	private int age;
	@Column(name = "grade", length = 255)
	private String grade;
	@Column(name = "name", length = 255)
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "students_courses",
			joinColumns = {
					@JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false, updatable = false)},
			inverseJoinColumns = {
					@JoinColumn(name = "course_id", referencedColumnName = "id", nullable = false, updatable = false)})
	private List<Courses> courses = new ArrayList<Courses>();
}
