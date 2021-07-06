package com.solo.latihanjpadewa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.solo.latihanjpadewa.entity.Comments;
import com.solo.latihanjpadewa.entity.Courses;
import com.solo.latihanjpadewa.entity.Instructor;
import com.solo.latihanjpadewa.entity.InstructorDetail;
import com.solo.latihanjpadewa.entity.Post;
import com.solo.latihanjpadewa.entity.Students;
import com.solo.latihanjpadewa.repository.CoursesRepository;
import com.solo.latihanjpadewa.repository.InstructorRepository;
import com.solo.latihanjpadewa.repository.PostRepository;
import com.solo.latihanjpadewa.repository.StudentsRepository;

@SpringBootApplication
public class LatihanJpaDewaApplication implements CommandLineRunner {
//	@Autowired
//	InstructorRepository instructorRepository;
//	@Autowired
//	PostRepository postRepository;
//	@Autowired
//	CoursesRepository courseRepository;
//	@Autowired
//	StudentsRepository studentsRepository;

	public static void main(String[] args) {
		SpringApplication.run(LatihanJpaDewaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		InstructorDetail detail = new InstructorDetail(0, "mancing", "Sula");
//		InstructorDetail detail2 = new InstructorDetail(0, "gaming", "Sule");
//		
//		Instructor instructor = new Instructor(0, "sulaimaniman6@gmail.com", "Sula", "Iman", detail);
//		Instructor instructor1 = new Instructor(0, "sulaiman6@gmail.com", "Sule", "Iman", detail2);
//		
//		List<Instructor> listInstructor = new ArrayList<Instructor>();
//		listInstructor.add(instructor);
//		listInstructor.add(instructor1);
//		
//		//this.instructorRepository.saveAll(listInstructor);
//		
//		List<Instructor> listData = this.instructorRepository.findAll();
//		
//		for(Instructor instructorx : listData) {
//			instructorx.toString();
//		}
//		
//		Comments comment= new Comments(0, "Saya netijen");
//		Comments comment1= new Comments(0, "Saya netijen1");
//		List<Comments> listComments = new ArrayList<Comments>();
//		listComments.add(comment);
//		listComments.add(comment1);
//		
//		Post post = new Post(0, "Ini adalah foto terbaik di Jepang", "Bunga Sakura", listComments);
//		//this.postRepository.save(post);
//		
//		List<Post> listPost = this.postRepository.findAll();
//		
//		for (Post postx : listPost) {
//			System.out.println(postx.getDescription());
//			for(Comments commentx : post.getComments()) {
//				System.out.println(commentx.getText());
//			}
//		}
		
		//Courses course = new Courses(0, "ILKOM", 4, 4, "RPL", student);
//		List<Students> students = new ArrayList<Students>();
//		List<Courses> courses = new ArrayList<Courses>();
//		
//		Students student = new Students();
//		student.setAge(23);
//		student.setGrade("A");
//		student.setName("Sulaiman");
//		student.setCourses(courses);
//		
//		Students student2 = new Students();
//		student2.setAge(25);
//		student2.setGrade("B");
//		student2.setName("Sula");
//			student2.setCourses(courses);
//			
//			students.add(student);
//		students.add(student2);
//		
//		Courses course = new Courses();
//		course.setAbbrevation("Ilkom");
//		course.setFee(2000.0);
//		course.setModules(10);
//		course.setTitle("Ilmu Komputer");
//		course.setStudents(students);
//		courses.add(course);
//		
//		Courses course2 = new Courses();
//		course2.setAbbrevation("RPL");
//		course2.setFee(5000.0);
//		course2.setModules(15);
//		course2.setTitle("Rekayasa Perangkat Lunak");
//		course2.setStudents(students);
//		courses.add(course2);
//		
//		this.studentsRepository.saveAll(students);
//		
//		List<Students> listStudent = (List<Students>) this.studentsRepository.findAll();
//		
//		for (Students studentx : listStudent) {
//			System.out.println(studentx.getName());
//			for (Courses coursex : student.getCourses()){
//				System.out.println(coursex.getTitle());
//			}
//		}
	}

}
