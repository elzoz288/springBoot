package io.javabrains.springbootstarter.CoursesApiApp.controllers;

import io.javabrains.springbootstarter.CoursesApiApp.Topic;
import io.javabrains.springbootstarter.CoursesApiApp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    TopicService topicService;
    @GetMapping("/getAll")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics().stream().toList();
    }
    @GetMapping("/{target}")
    public Optional<Topic> getTopic(@PathVariable String target){
       return topicService.getTopicOf(target);
    }
    @RequestMapping(method=RequestMethod.POST,value = "/addTopic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT,value = "/update/{name}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String name){
         topicService.updateTopic(topic,name);
    }

    @RequestMapping(method=RequestMethod.DELETE,value = "/delete/{id}")
    public void deleteTopic(@PathVariable String id){
       topicService.deleteTopic(id);
    }


}
