package AbstractClassesandInterfaces;

public class Accountant extends Employee{

    public Accountant(String name, String department, int id) {
        super(name, department, id);
    }


    public String work() {
        return "TPS Reports drafted!";
    }

    public String morningMeeting() {
        return "Accountants have meetings beginning at 8:15Am and run until 8:45AM.";
    }

    @Override
    public String lunchTime() {
        return "Accountants take their lunch when they want at their desk.";
    }

    @Override
    public int dailyPay() {
        return 500;
    }


}
