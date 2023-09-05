package io.javabrains.springbootstarter.CoursesApiApp.service;

import io.javabrains.springbootstarter.CoursesApiApp.Course;
import io.javabrains.springbootstarter.CoursesApiApp.Topic;
import io.javabrains.springbootstarter.CoursesApiApp.model.CourseRepository;
import io.javabrains.springbootstarter.CoursesApiApp.model.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        List<Course> courses=new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }
    public List<Course> getAllCoursesOf(String topicID){
        return new ArrayList<>(courseRepository.findByTopicId(topicID));
    }
   public Optional<Course> getCourse(String  id){
      return courseRepository.findById(id);

   }
   public void addCourse(Course course){
       courseRepository.save(course);
   }

   public void updateCourse(Course course ,String id){
       courseRepository.save(course);
   }

   public void deleteCourse(String id){
       courseRepository.deleteById(id);
   }



}





