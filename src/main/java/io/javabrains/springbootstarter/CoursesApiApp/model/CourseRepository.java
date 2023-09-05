package io.javabrains.springbootstarter.CoursesApiApp.model;

import io.javabrains.springbootstarter.CoursesApiApp.Course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,String> {
    List<Course> findByTopicId(String topicID);  //my custom get function depended on topicID


}
