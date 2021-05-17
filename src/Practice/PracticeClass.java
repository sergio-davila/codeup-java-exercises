package Practice;

public class PracticeClass {

    private String firstName;
    private String lastName;


    public PracticeClass(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Illegal Argument EXCEPTION!!!!");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
