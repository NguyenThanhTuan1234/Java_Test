package Company;

import java.util.Date;

/**
 * Created by tuankun on 26/06/2017.
 */
public class Employee extends Person {
    String dateJoin;
    String position;
    double salaryLevel;
    double basicSalary;


    @Override
    public void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Year of Birth: "+ yearOfBirth);
        if(getGender()==true){
            System.out.println("Gender: Male");
        }
        else{
            System.out.println("Gender: Female");
        }
        System.out.println("Datejoin: " + dateJoin);
        System.out.println("Position: " + position);
        System.out.println("Income: " + salaryLevel*basicSalary );
    }

    public double getIncome(){
        return salaryLevel*basicSalary;
    }

    public void setSalaryLevel(double salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Employee(int id, String name, boolean gender, int yearOfBirth) {
        super(id, name, gender, yearOfBirth);
    }

}
