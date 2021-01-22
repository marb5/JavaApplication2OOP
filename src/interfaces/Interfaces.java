package interfaces;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Marcin
 */
public class Interfaces {
    public static void main(String[] args) {
        System.out.println(newInterface.PI);
        
        newInterface a = new Employee(6456.77);
        System.out.println(((Employee)a).getSalary());
        
        int[] array = {34, -23, 4};
        Arrays.sort(array);
        for (int arr: array)
        {
            System.out.println(arr);
        }
        
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(14000);
        employees[1] = new Employee(4000);
        employees[2] = new Employee(9000);
        
        //Arrays.sort(employees);
        Arrays.sort(employees, Collections.reverseOrder());
        
        for (Employee e: employees)
        {
            System.out.println(e.getSalary());
        }
    }
}

interface newInterface {
    double PI = 3.14; // public static final
    void message(); //public abstract
}

//we can implement more than 1 interface
class Employee implements newInterface, Comparable {
    private double salary;
    
    @Override
    public void message() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Employee(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee)o;
        if (this.salary < emp.salary)
            return -1;
        else if (this.salary > emp.salary)
            return 1;
        else
            return 0;
    }
}

//in java we can extend only one class
/*class Programmer extends Employee {
    
}*/