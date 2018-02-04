package io.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	/**
	 * Custom filters for natives types are findBy_Property format
	 * **/
	public List<Course> findByName(String name);

	public List<Course> findByDescription(String description);
	
	
	
	/**
	 * Custom filters for T types are findBy_Type_PropertyInType format	 
	 * **/	
	public List<Course> findByTopicId(String topicId);

}
