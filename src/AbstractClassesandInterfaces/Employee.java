package AbstractClassesandInterfaces;

abstract class Employee {
    protected String name;
    protected String department;
    protected int id;

    public abstract String work(); // Setting up a blank method -  our class that inherit will fill in the deets!

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }


}
