package Bai_1;

public class Employee extends Person {
    private int salary;

    public Employee(String name, String address) {
        super(name, address);
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public void display() {
//        super.display();
//        System.out.println(", salary=" + salary);
        System.out.println("Employee name: " + super.getName());
        System.out.println("Employee address: " + super.getAddress());
        System.out.println("Employee balance: " + salary);
    }

}
