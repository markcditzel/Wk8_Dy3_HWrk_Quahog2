package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="courses")

public class Course {

    //Instance variables

    private int id;
    private String name;
    private String level;
    private List<Student> enrolledStudents;

    // Dummy constructor
    public Course(){
    }

    // Constructor
    public Course(String name, String level) {
        this.name = name;
        this.level = level;
    }

    // GETTERS AND SETTER


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
