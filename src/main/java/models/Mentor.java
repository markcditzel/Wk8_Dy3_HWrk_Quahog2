package models;

import javax.persistence.*;

@Entity
@Table(name="mentors")
public class Mentor {

    //Instance variables

    private int id;
    private String name;

    //Dummy Constructor
    public Mentor() {
    }

    //Constructor

    public Mentor(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
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
}
