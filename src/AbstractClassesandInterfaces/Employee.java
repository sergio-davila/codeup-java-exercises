package AbstractClassesandInterfaces;

abstract class Employee implements DailyWork{
    protected String name;
    protected String department;
    protected int id;

    public Employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    // public abstract String work(); // Setting up a blank method -  our class that inherit will fill in the deets!



//    public Employee() {
//        this.name = "Unknown";
//        this.department = "Unknown";
//        this.id = 0;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
