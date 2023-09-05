import org.w3c.dom.html.HTMLTableRowElement;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataBaseService {


//Description: Adds a new employee to the database. Throws DuplicateEmployeeException if an employee with the same name already exists.

    public void addEmployee(String name, Department department, double salary, int yearsOfExperience) throws DuplicateEmployeeException {

        Employee employee = new Employee(getNextId(), name, salary, yearsOfExperience, department);
        if (getEmployeeById(employee.getId()) != null) {
            throw new DuplicateEmployeeException("This employee is already in the database");
        }
        Database.employeeList.add(employee);


    }

    public int getNextId() {
        return Database.employeeList.size() + 1;
    }

    public Employee getEmployeeById(int id) {
        for (Employee value : Database.employeeList) {
            if (value.getId() == id) {
                return value;
            }

        }
        return null;

    }

    // returns all employees from employeeList
    public List<Employee> getAllEmployees() {
        return Database.employeeList;
    }
/*
public void updateEmployee(Employee employee, String newName, Department newDepartment, double newSalary, int yearsOfExperience)
​​Description: Updates the details of an existing employee in the database, such as name, department, years of experience, and salary.
 */

    public void updateEmployee(Employee employee, String newName, Department newDepartment, double newSalary, int newYearsOfExperience) {

        Employee value = getEmployeeById(employee.getId());

        value.setFullName(newName);
        value.setDepartment(newDepartment);
        value.setSalary(newSalary);
        value.setYearsOfExperience(newYearsOfExperience);


    }


    /*

Description: Applies a bonus to an employee's salary.
     */
    public void applyBonusToEmployee(Employee employee, double bonus) {
        Employee value = getEmployeeById(employee.getId());
        value.setBonus(bonus);


    }

    public List<Department> getAllDepartments(){
        return Database.departmentList;
    }

    /*
     Description: Sorts the list of employees in the database based on their department names.
     public void sortEmployeesByDepartment(){
        Collections.sort(Database.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getDepartment().getName().compareTo(emp2.getDepartment().getName());
            }
        });
    }
     */
    public void sortEmployeesByDepartment(){
        Collections.sort(Database.employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getDepartment().getTitle().compareTo(employee2.getDepartment().getTitle());
            }
        });

    }
    /*
Description: Sorts the list of employees in the database based on their salary in ascending order.
     */
    public void sortEmployeesBySalary(){
        Collections.sort(Database.employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return (int)(employee1.getSalary()-employee2.getSalary());
            }
        });
    }
}
