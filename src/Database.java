import java.util.ArrayList;
import java.util.List;

public class Database {
    /*
    Database class would use a static list of employees and departments, you can copy this code and modify it to your liking:
     */


      public static  List<Employee> employeeList = new ArrayList<>();
       public static  List<Department> departmentList = new ArrayList<>();

    static{

        departmentList.add(new Department(1, "IT"));
        departmentList.add(new Department(2, "Accounting"));
        departmentList.add(new Department(3, "Sales"));
        departmentList.add(new Department(4, "Marketing"));

        employeeList.add(new Employee(1, "Luba Avakova", 100000, 5, departmentList.get(0)));
        employeeList.add(new Employee(2, "Mira Bay", 200000, 10, departmentList.get(1)));
        employeeList.add(new Employee(3, "Nora Kochubey", 300000, 3, departmentList.get(2)));
        employeeList.add(new Employee(2, "Tatian Belke", 150000, 1, departmentList.get(3)));


    }
}
