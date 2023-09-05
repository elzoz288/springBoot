package io.javabrains.springbootstarter.CoursesApiApp.model;

import io.javabrains.springbootstarter.CoursesApiApp.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {

}
