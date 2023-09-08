import java.util.Date;
import static java.lang.System.*;

public class Employee {
    private String name;
    private Date hireDate;
    public Employee(){
        name = "No name";
        hireDate = new Date(1000, 1, 1);
    }
    public Employee(String theName, Date theDate){
        if (theName == null || theDate == null){
            System.out.println("Fatal error creating employee.");
            System.exit(0);
        }
        name = theName;
        hireDate = theDate;
    }
    public Employee(Employee originalObject){
        name = originalObject.name;
        hireDate = originalObject.hireDate;
    }

    public String getName(){
        return name;
    }
    public Date getHireDate(){
        return hireDate;
    }
    public void setName(String newName){
        if (newName == null){
            System.out.println("Fatal error setting employee name");
        } else
            name = newName;
    }
    public void setHireDate(Date newDate){
        if (newDate == null){
            System.out.println("Fatal error setting employee hire date");
            System.exit(0);
        } else
            hireDate = new Date(String.valueOf(newDate));
    }
    public String toSting(){
        return (name + " " + hireDate.toString());
    }
    public boolean equals(Employee otherEmployee){
        return(name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
    }
}
