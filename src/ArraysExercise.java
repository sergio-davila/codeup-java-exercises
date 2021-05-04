import java.util.Arrays;
import java.util.Scanner;
import oopLecture.Person;

public class ArraysExercise {

    public static String[] addPerson(String[] array, String person) {
        String[] newArray = Arrays.copyOf(array, (array.length + 1));
        newArray[newArray.length - 1] = person;
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] persons = new String[3];

        Person ken = new Person("Kenneth", "Howell");
        Person vanessa = new Person("Vanessa", "Noriega");
        Person douglas = new Person("Douglas", "Hirsh");
        Person alex = new Person("Alex", "Davila");
        Scanner sc = new Scanner(System.in);

        persons[0] = ken.firstName;
        persons[1] = vanessa.firstName;
        persons[2] = douglas.firstName;

        System.out.println("persons[0] = " + persons[0]);
        System.out.println("persons[1] = " + persons[1]);
        System.out.println("persons[2] = " + persons[2]);

        String[] newPersons = addPerson(persons, alex.firstName);
        System.out.println("Arrays.toString(newPersons) = " + Arrays.toString(newPersons));
    }
}