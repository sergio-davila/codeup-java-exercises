import java.util.*;

public class CollectionsLecture {

    public static void printEachElement(ArrayList<String> strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        // ----------------------------- Array Lists

        // Creating Array Lists and Getting Elements

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        System.out.println("numbers = " + numbers);
//        numbers.add(7);
//        System.out.println("numbers = " + numbers);

//        System.out.println(numbers); // used to peek into the list
//        System.out.println(numbers.get(0));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("bob");
        strings.add("hello");
        strings.add("etc");

        //        System.out.println(strings);

        String bob = strings.get(0);


        System.out.println(bob.toUpperCase());

        // TODO: write an array list of three people in this cohort
        // TODO: print out each person's name in the list

        ArrayList<String> marco = new ArrayList<>();

        marco.add("Vanessa");
        marco.add("Nick");
        marco.add("Kelvon");
        marco.add("Iffy");

        System.out.println("marco = " + marco);
        System.out.println("marco.get(0) = " + marco.get(0));
        System.out.println("marco.get(1) = " + marco.get(1));
        System.out.println("marco.get(2) = " + marco.get(2));
        System.out.println("marco.get(3) = " + marco.get(3));


        // Creating ArrayList with Arrays.asList()

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));
//
//        System.out.println(names);

        // Getting Elements by Index Number

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));
//
//        System.out.println(names.get(2));
//        System.out.println(names.get(5)); // ?

        // Adding & Editing Elements

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        numbers.add(20);
        System.out.println(numbers);
        numbers.add(0, 21); // expands the array size
        System.out.println(numbers);
        numbers.set(0, 7); // edits the value at that index
        System.out.println(numbers);
//        numbers.add(10, 22); // ???
//        System.out.println(numbers);
//
        System.out.println(numbers.size());

        // Removing Elements

        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Fred",
                "Sally",
                "Cindy",
                "Cindy"
        ));
        System.out.println(names);
        names.remove(0);
        System.out.println(names);

//        names.remove("Cindy");
//        names.remove("Cindy");

        names.removeAll(Arrays.asList("Cindy", "Cindy"));
        System.out.println(names);

        // Removing Number by Value or Index

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        numbers2.remove(2);
        numbers2.remove(Integer.valueOf(1)); // remove by value of the number
        System.out.println(numbers2);

        // reordering list


        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);

        // Additional Methods

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(numbers3.size());
        System.out.println(numbers3.indexOf(3));
        System.out.println(numbers3.indexOf(105)); // gives back -1

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("medium");
        roasts.add("light");
        roasts.add("medium");
        roasts.add("dark");
        System.out.println(roasts);
        System.out.println(roasts.contains("dark"));
        System.out.println(roasts.contains("espresso"));
        System.out.println(roasts.lastIndexOf("medium"));
        System.out.println(roasts.isEmpty());

        /*

            TODO:
               1. Create a class called CollectionsPractice with a main method.
               2. Create a static method, upperLastElement, that takes in an array list and
                  returns the array list with last string capitalized. An empty array list
                  should be returned if the passed array list is empty. If the passed array
                  list only has one string, capitalize it.
               3. In the main method, create an array list of first name strings of three people in Marco.
               4. Test the upperLastElement method on your array of Marco people.

               Examples

               ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin, "Douglas", "Kenneth"));
               upperLastElement(names) should return "Justin", "Douglas", "KENNETH"

               ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Kenneth"));
               upperLastElement(names2) should return "KENNETH"

               ArrayList<String> names3 = new ArrayList<>();
               upperLastElement(names3) should return an empty array list

         */

        // List vs. ArrayList (Polymorphism)

//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("bob", "steve", "justin"));
//        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("bob", "steve", "justin"));
//
//        printEachElement(linkedList);

        // Java Generics

        List unsafe = new ArrayList();
        unsafe.add(new Object());
        unsafe.add(3);
        unsafe.add("hello");
        unsafe.add(true);

        System.out.println("unsafe = " + unsafe);

        String str1 = (String) unsafe.get(2); // must explicitly cast
        System.out.println("str1 = " + str1);
//        String str2 = (String) unsafe.get(0); // can lead to runtime exceptions
//        System.out.println("str2 = " + str2);

        // ----------------------------- Hash Maps

        // creating hash maps

        Map<String, String> usernames = new HashMap<>();
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Luis", "MontealegreLuis");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");
        System.out.println(usernames);

        // getting values from and info about hash map

//        System.out.println(usernames);
        System.out.println(usernames.get("Justin"));
        System.out.println(usernames.get("Zach"));
        System.out.println(usernames.get("Ryan"));
        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
        System.out.println(usernames.containsKey("Luis"));

        // updating hash maps

        usernames.put("Ryan", "rorsinger");
        System.out.println(usernames);
        System.out.println(usernames);
        usernames.put("Ryan", "Test");
//
//        usernames.putIfAbsent("Zach", "coderdude24");
//        System.out.println(usernames);
//        usernames.replace("Ryan", "torvalds"); // same as put
//        System.out.println(usernames);

        // removing pairs from hash map

        System.out.println(usernames.remove("Zach"));
        System.out.println(usernames);
        System.out.println(usernames.remove("Zach"));
        System.out.println(usernames);
//        System.out.println(usernames);
//        usernames.clear();
//        System.out.println(usernames);
//        System.out.println(usernames.isEmpty());



            //TODO: Create a HashMap of three people in class with keys using their last name and values at those keys using their first name.

//             Example
//
//             "Justin" could be returned from nameHashMap.get("Reich")

            Map<String, String> marcoMap = new HashMap<>();
            marcoMap.put("Noriega", "Vanessa");
            marcoMap.put("Sheikh", "Irfa");
            marcoMap.put("Patterson", "Kelvon");
        System.out.println("marcoMap = " + marcoMap);

        // BONUS TODO: Create a HashMap containing three people in the class with keys using their first name and values that are an ArrayList of strings containing at least two objects visible in their background.

//             Example
//
//             ArrayList<String> with values ("Codeup Sign", "Black Background", "Nothing Else")
//             from backgroundHashMap.get("Justin")




    }

}