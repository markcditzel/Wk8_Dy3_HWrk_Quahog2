package models;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    //Instance variables

    private int id;
    private String name;
    private int age;
    private int enrolNum;
    private Mentor mentor;
    private Course course;

    // Dummy constructor
        public Student(){
    }

    // Constructor
        public Student(String name, int age, int enrolNum, Mentor mentor, Course course) {
        this.name = name;
        this.age = age;
        this.enrolNum = enrolNum;
        this.mentor = mentor;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name="enrolNum")
    public int getEnrolNum() {
        return enrolNum;
    }

    public void setEnrolNum(int enrolNum) {
        this.enrolNum = enrolNum;
    }


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentor_id", nullable = false)
    Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
