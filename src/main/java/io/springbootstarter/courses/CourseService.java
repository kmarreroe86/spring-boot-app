package io.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courses = this.courseRepository.findByTopicId(topicId);
		return courses;
	}

	public Course getCourseById(String id) {

		return this.courseRepository.findOne(id);
	}

	public void addCourse(Course course) {

		this.courseRepository.save(course);
	}

	public void updateCourse(Course course) {

		/**
		 * If found do an update, insert otherwise, so we need to check for
		 * exist first
		 **/
		this.courseRepository.save(course);

	}

	public void deleteCourseByIdd(String id) {

		this.courseRepository.delete(id);
	}

}
