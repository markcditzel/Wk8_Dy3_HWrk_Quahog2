import db.DBHelper;
import models.Mentor;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        //TODO: AIM 1: Establish a one-to-one with Student class = ONGOING

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

        //TODO: Objective1B: Create Student class and test = ONGOING

        //Create a Student
        Student student1 = new Student("Eric Banner",22,1556739, mentor1);
        Student student2 = new Student("Donny Darko", 16, 68009, mentor3);
        Student student3 = new Student("Benny Hill", 99, 9999, mentor4);

        //Save student to db
        DBHelper.save(student1);
        DBHelper.save(student2);
        DBHelper.save(student3);

        //Update student
        student1.setAge(33);
        DBHelper.update(student1);

        //Delete student
        DBHelper.delete(student2);


        // TODO: Objective1C: Set up the one-to-one relationship on Mentor
        //Established that a mentor can exist without a student, but not vice versa
        //Therefore, the a mentor must be included in the students constructor

        //Update the student constructor = done

        //Test is updated Student data populates db table = done

        //Annotate Student Class's getMentor to hold the foreign key of the Mentor (FETCH and JOINTABLE) = done

        //Use Lazy Fetch method
        //nullable = false - so a Student must have Mentor allocated

        //Update the Mentor instance variables to accept a Student, but don't add to constructor or initialise - as a Mentor can be without a Student = done

        // Update getter and setter for Student = done

        // Annotate getStudent - mapped by mentor = done

        //TODO: Objective1D - test if a student:mentor relationship can be saved to db

        // DB entries updated with 'mentor_id" = done







    }

}
