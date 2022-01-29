package main.design.patterns;

class Employee {
    private String name;
    private int empId;

    Employee() {
    }

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

/* https://dzone.com/articles/how-to-create-an-immutable-class-in-java
Q. How Do We Create an Immutable Class
   In order to create an immutable class, you should follow the below steps:
1. Make your class final, so that no other classes can extend it.
2. Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
3. Don’t expose setter methods.
4. When exposing methods which modify the state of the class, you must always return a new instance of the class.
5. If the class holds a mutable object:
    Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who pass the object from modifying it afterwards.
    Make sure to always return a clone copy of the field and never return the real object instance.
*/
public final class ImmutableExample {
    private final int number;
    private final String name;
    private final Employee employee;

    public ImmutableExample(int number, String name, Employee employee) {
        this.number = number;
        this.name = name;
        // in case of mutable objects we must do a deep copy to avoid risk of
        this.employee = new Employee();
        this.employee.setEmpId(employee.getEmpId());
        this.employee.setName(employee.getName());
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        Employee emp = new Employee();
        emp.setName(this.employee.getName());
        emp.setEmpId(this.employee.getEmpId());
        return emp;
    }
}
