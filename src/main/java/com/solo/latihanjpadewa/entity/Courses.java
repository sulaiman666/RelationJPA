package com.solo.latihanjpadewa.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "courses")
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 12)
	private long id;
	@Column(name = "abbrevation", length = 255)
	private String abbrevation;
	@Column(name = "fee")
	private double fee;
	@Column(name = "modules", length = 11)
	private int modules;
	@Column(name = "title", length = 255)
	private String title;
	
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private List<Students> students = new ArrayList<Students>();
}
