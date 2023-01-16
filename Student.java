import java.sql.Date;

public class Student {

    String name;
    int id;
    Date dob;
    Boolean status;
    public Student(String name, int id, Date dob, Boolean status){
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.status = status;
    }
    public void setName(String name, Boolean status){
        if (status == true) {
            this.name = name;
        }
    }
}