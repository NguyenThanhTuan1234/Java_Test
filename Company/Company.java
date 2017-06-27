package Company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tuankun on 26/06/2017.
 */
public class Company {
    String name;
    String dateCreate;
    List<Employee> employees;
    public Company(){
        this.name = name;
        this.dateCreate = dateCreate;
        this.employees=new ArrayList<Employee>();
    }

    public String getName(){
        return name;
    }

    public void showListEmployees(){
        int i;
        for(Employee e:this.employees){
            e.display();
        }
    }

    public void addNewEmployee(Employee e){

    }

    public void info(){
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.name = "Tuan";
        Date date = new Date();
        System.out.println("Company name: "+ company.name);
        System.out.println("Date Create: "+ date.toString());
        Employee employee=new Employee(1 , "Nguyen Thanh Tuan",true ,1995);
        company.employees.add(employee);
        company.showListEmployees();
    }
}
