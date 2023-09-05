/*

Fields:
Id
Fullname
Department
Salary
Bonus
years of experience
Methods:
Getters
Setters
Constructors: default & non-default
toString()

Two exception classes, extending from an Exception class:
EmployeeNotFoundException
DuplicateEmployeeException

 */

public class Employee {
    private int id;
    private String fullName;
    private double salary;
    private double bonus;
    private int yearsOfExperience;

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(int id, String fullName, double salary, int yearsOfExperience, Department department) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.department = department;
    }

    public Employee() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }



}
