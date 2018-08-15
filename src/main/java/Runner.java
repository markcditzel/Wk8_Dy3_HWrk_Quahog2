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

        //Save mentor to db
        DBHelper.save(mentor1);
        DBHelper.save(mentor2);

        //Update mentor
        mentor1.setName("Dr X");
        DBHelper.update(mentor1);

        //Delete mentor
        DBHelper.delete(mentor2);

        //TODO: Objective1B: Create Student class and test = ONGOING

        //Create a Student
        Student student1 = new Student("Eric Banner",22,1556739);
        Student student2 = new Student("Donny Darko", 16, 68009);

        //Save student to db
        DBHelper.save(student1);
        DBHelper.save(student2);

        //Update student
        student1.setAge(33);
        DBHelper.update(student1);

        //Delete student
        DBHelper.delete(student1);




    }

}
