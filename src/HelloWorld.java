public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("I want to say hello to the world!");
//        System.out.print("Hello, ");
//        System.out.print("World!");

        // 1
        int myFavoriteNumber = 15;
        System.out.println(myFavoriteNumber);

        // 2
        String myString = "blah blah";
        System.out.println(myString);

        // 3
//        myString = 'g'; //cant re-assign a variable to a different data type

        // 4
//        myString = 42; //same thing as above^^

        // 5
        float myNumber;
//        System.out.print(myNumber); //can't run an empty variable!

        // 6
//        myNumber = 3.14; //can't assign a value that big to long, double is required

        // 7
//        myNumber = 123L;
//        System.out.println(myNumber);

        // 8
//        myNumber = 123;
//        System.out.println(myNumber);

        // 9
//        myNumber = 3.14F;
//        System.out.println(myNumber);
//        myNumber = (float) 3.14;
//        System.out.println(myNumber);

        // 10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

        // 11
        // String class = "Hello"; class is a reserved word and cant be used

        // 12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three); cant cast Strings into ints!

//        int three2 = (int) "three";  //same thing as line 36^

        // 13
//        int z = 4;
//        z += 5;
//        System.out.println(z);
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        System.out.println(x);
        y -= x;
        System.out.println(y);
        // 14
        int max = Integer.MAX_VALUE;
        System.out.println("max = " + max);
    }
}