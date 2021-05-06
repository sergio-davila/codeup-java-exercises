package AbstractClassesandInterfaces;

public class Custodian extends Employee{

    public Custodian(String name, String department, int id) {
        super(name, department, id);
    }

    public String work() {
        return "Maintaining the building!";
    }

    @Override
    public String morningMeeting() {
        return "Custodians meetup to clean up da poopoo in the morning";
    }

    @Override
    public String lunchTime() {
        return "Custodians tale their lunch from 12:00PM to 1:30PM";
    }

    @Override
    public int dailyPay() {
        return 300;
    }
}
