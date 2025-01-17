public class Employee {
    String name;
    int id;
    int salary;
//    Address address;
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }


    public static void main(String args[]) {
        Employee e1 = new Employee("Vikash",12215647,4000000);
        e1.getName();
        e1.getId();
        e1.getSalary();
    }
}