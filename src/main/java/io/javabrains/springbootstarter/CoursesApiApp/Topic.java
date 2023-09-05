package io.javabrains.springbootstarter.CoursesApiApp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Topic {
   @Id
    private String id;

    private String name;
    private String description;
   /* @OneToMany
    private List<Course> courses;*/
    /*public Topic() {}

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }*/

    /*public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }*/

    @Override
    public String toString() {
        return "Topic{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + '}';
    }
}
