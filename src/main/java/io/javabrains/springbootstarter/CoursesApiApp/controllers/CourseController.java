package io.javabrains.springbootstarter.CoursesApiApp.controllers;

import io.javabrains.springbootstarter.CoursesApiApp.Course;
import io.javabrains.springbootstarter.CoursesApiApp.Topic;
import io.javabrains.springbootstarter.CoursesApiApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topics")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/getAll/courses")  //get all courses
    public List<Course> getAllCourses(){
         return courseService.getAllCourses().stream().toList();
    }
    @GetMapping("/getAll/courses/{topicID}")     //go and find all courses that have topicID = ??
    public List<Course> getAllCoursesOf(@PathVariable String topicID){
        return courseService.getAllCoursesOf(topicID).stream().toList();
    }
    @GetMapping("/gitCourse/{id}")   //get the course of id = ??
    public Optional<Course> getCourse(@PathVariable String id){
       return courseService.getCourse(id);
    }
    @RequestMapping(method=RequestMethod.POST,value = "/{topicID}/addCourse")  //insert anew course wiht topic that have id = ??
    public void addCourse(@RequestBody Course course,@PathVariable String topicID){
        course.setTopic(new Topic(topicID,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method=RequestMethod.PUT,value = "/update/{id}/course/{topicID}") //update the course have id = ?? with
                                                                                       //new course (in request body ) and topic that have id =??
    public void updateCourse(@RequestBody Course course,@PathVariable String id,@PathVariable String topicID){
       course.setTopic(new Topic(topicID,"",""));
        courseService.updateCourse(course,id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value = "/delete/course/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }


}
