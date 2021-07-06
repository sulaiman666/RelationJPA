package com.solo.latihanjpadewa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "instructor")

public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 12)
	private long id;
	@Column(name = "email", length = 255)
	private String email;
	@Column(name = "first_name", length = 255)
	private String first_name;
	@Column(name = "last_name", length = 255)
	private String last_name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructorDetail;
}
