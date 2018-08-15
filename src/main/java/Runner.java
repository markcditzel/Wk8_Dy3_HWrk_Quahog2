import db.DBHelper;
import models.Mentor;

public class Runner {

    public static void main(String[] args) {

        // Create a Mentor
        Mentor mentor1 = new Mentor("Prof X");

        //Save mentor to db
        DBHelper.save(mentor1);

    }

}
