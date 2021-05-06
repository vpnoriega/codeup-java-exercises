package AbstractClassesandInterfaces;

public class Employee {
    protected String name;
    protected String department;
    protected int id;

    public Employee(String name, String department, int id){
        this.name = name;
        this.department=department;
        this.id=id;
    }

    public String work() // setting up a blank method - our classes that inherit will fill in the deets
    {
        return null;
    }


}
