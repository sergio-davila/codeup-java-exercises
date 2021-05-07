import java.util.*;

import java.util.Locale;

public class CollectionsPractice {

//    public static String[] upperLastElement(String[] array) {
//        String[] newArray = Arrays.copyOf(array, (array.length));
//        newArray[array.length - 1] = newArray[array.length - 1].toUpperCase();
//        return newArray;
//    }
//

    public static ArrayList<String> upperLastElement(ArrayList<String> names) {
        String lastString = names.get(names.size() - 1).toUpperCase();
        names.set(names.size() - 1, lastString);
        return names;
    }

    public static void main(String[] args) {

        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin", "Douglas", "Kenneth"));

        System.out.println("upperLastElement(names1) = " + upperLastElement(names1));


    }
}
