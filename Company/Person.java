package Company;

/**
 * Created by tuankun on 26/06/2017.
 */
public class Person {
    static int id=0;
    String name;
    int yearOfBirth;
    Boolean gender;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void display(){

    };

    public Person(int id, String name, boolean gender , int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public Person() {
        id++;
    }
}
