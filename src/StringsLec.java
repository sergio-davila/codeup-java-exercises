public class StringsLec {
    public static void main(String[] args) {
        String myName = "Sergio";
        String myName2 = myName;
        String myName3 = myName2;
        String lowerCaseName = "sergio";


        System.out.println("(myName == myName2) = " + (myName.equals(myName2)));
        System.out.println("(myName2 == myName3) = " + (myName2.equals(myName3)));
        System.out.println("(myName == myName3) = " + (myName.equals(myName3)));

        System.out.println("(lowerCaseName == myName) = " + (lowerCaseName.equals(myName)));
    }
}
