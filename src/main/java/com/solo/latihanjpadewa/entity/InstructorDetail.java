package com.solo.latihanjpadewa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "instructor_detail")

public class InstructorDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 12)
	private long id;
	@Column(name = "hobby", length = 255)
	private String hobby;
	@Column(name = "youtube_channel", length = 255)
	private String youtube_channel;
}
