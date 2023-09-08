import java.util.Date;
import java.lang.System.*;
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;
    public HourlyEmployee(String theName, Date theDate, double theWagesRate, double theHours){
        super(theName, theDate);
        if(theWagesRate >= 0 && theHours >= 0){
            wageRate = theWagesRate;
            hours = theHours;
        } else {
            System.out.println("Fatal error: creating an illegal hourly employee.");
            System.exit(0);
        }
    }
    public HourlyEmployee(HourlyEmployee originalObject){
        super(originalObject);
        wageRate = originalObject.wageRate;
        hours = originalObject.hours;
    }
    public double getRate(){
        return wageRate;
    }
    public double getHours(){
        return hours;
    }
    public double getPay(){
        return wageRate * hours;
    }

    public void  setHours(double hoursWorked){
        if(hoursWorked >= 0){
            hours = hoursWorked;
        } else {
            System.out.println("Fatal Error: Negative hours worked.");
            System.exit(0);
        }
    }
    public void setRate(double newWageRate){
        if(newWageRate >= 0){
            wageRate = newWageRate;
        } else {
            System.out.println("Fatal Error: Negative wage rate.");
            System.exit(0);
        }
    }
    public String toString(){
        return (getName() + " "+ getHireDate()+ " " + "\n$" + wageRate + " Per hour for " + hours + " hours.");
    }
    public  boolean equals(HourlyEmployee other){
        return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate())
                && wageRate == other.wageRate && hours == other.hours);
    }

}
