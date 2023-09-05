package io.javabrains.springbootstarter.CoursesApiApp.service;

import io.javabrains.springbootstarter.CoursesApiApp.Topic;
import io.javabrains.springbootstarter.CoursesApiApp.model.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics =new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
   public Optional<Topic> getTopicOf(String  id){
      /* Topic s=topicModel.topicsRepo.stream().filter(i->(i.getId())==p)
               .findAny().orElse(new Topic(0,"null","couldn't find what you want"));*/
       //Topic T=getAllTopics().stream().filter(t->t.getId().equals(id)).findFirst().get();
      return topicRepository.findById(id);

   }
   public void addTopic(Topic topic){
        topicRepository.save(topic);
   }

   public void updateTopic(Topic topic ,String name){
     topicRepository.save(topic);
   }

   public void deleteTopic(String id){
     topicRepository.deleteById(id);
   }


}





