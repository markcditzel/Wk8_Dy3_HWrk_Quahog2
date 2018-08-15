import db.DBHelper;
import models.Course;
import models.Mentor;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        //TODO: AIM 1: Establish a one-to-one with Student class = Completed

        //TODO: Objective1A: Create Mentor class and test = DONE
        // Create a Mentor
        Mentor mentor1 = new Mentor("Prof X");
        Mentor mentor2 = new Mentor("Mr Bean");
        Mentor mentor3 = new Mentor("Dr Spock");
        Mentor mentor4 = new Mentor("Dr Doom");

        //Save mentor to db
        DBHelper.save(mentor1);
        DBHelper.save(mentor2);
        DBHelper.save(mentor3);
        DBHelper.save(mentor4);

        //Update mentor
        mentor1.setName("Dr X");
        DBHelper.update(mentor1);

        //Delete mentor
        DBHelper.delete(mentor2);

        //Create Course
        Course course1 = new Course("Maths", "GCSE");
        Course course2 = new Course("Biology", "A-level");

        //Save Course
        DBHelper.save(course1);
        DBHelper.save(course2);

        //TODO: Objective1B: Create Student class and test = ONGOING

        //Create a Student
        Student student1 = new Student("Eric Banner",22,1556739, mentor1, course1);
        Student student2 = new Student("Donny Darko", 16, 68009, mentor3, course2);
        Student student3 = new Student("Benny Hill", 99, 9999, mentor4, course2);

        //Save student to db
        DBHelper.save(student1);
        DBHelper.save(student2);
        DBHelper.save(student3);

        //Update student
        student1.setAge(33);
        DBHelper.update(student1);

        //Delete student
        DBHelper.delete(student2);




        // TODO: Objective1C: Set up the one-to-one relationship on Mentor = DONE
        //Established that a mentor can exist without a student, but not vice versa
        //Therefore, the a mentor must be included in the students constructor

        //Update the student constructor = done

        //Test is updated Student data populates db table = done

        //Annotate Student Class's getMentor to hold the foreign key of the Mentor (FETCH and JOINTABLE) = done

        //Use Lazy Fetch method
        //nullable = false - so a Student must have Mentor allocated

        //Update the Mentor instance variables to accept a Student, but don't add to constructor or initialise - as a Mentor can be without a Student = done

        // Update getter and setter for Student = done

        // Annotate Mentor's getStudent - mapped by mentor = done

        //TODO: Objective1D - test if a student:mentor relationship can be saved to db

        // DB entries updated with 'mentor_id" = done

        //TODO: Aim 2 - Establish one Course to many Student relationship = ONGOING

        // TODO Aim2 Objective 1: Create Course Class and annotate = done

        // Title Str; Level Str OR MAKE ENUM

        // The Course class holds a List of students - referred to as enrolledStudents

        // Do not pass to constructor or initialise - as we can have a course (initially) without enrolled students; NB Hibernate uses the setter method to allocate students

        // Make Getter and Setters for all instance variables = done

        // Annotate the Course id and other passive columns = done

        // Course holds the primary key and Students the foreign key

        //Primary Key holders (Course) are mapped by their Class in the foreign key holder class (Student)

        // Update mapper in hibernate xml

        //TODO Aim2 Objective 2: Modify and Annotate the existing Student class to establish realationship with Course

        // Add Course to instance variables and constructor - a student should be enrolled on a course when the enter the uni

        // Make Getter and setter

        //Annotate the course getter - ManyToOne and JoinColumn on course_id












    }

}
