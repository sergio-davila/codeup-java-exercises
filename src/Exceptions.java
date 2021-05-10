public class Exceptions {


    public static void main(String[] args) throws Exception{
        // throw new Exception("This has broken down! Exception"); // Throwing a generic exception; will break our application!

        // A bunch of nice code down here - unreachable past a thrown exception!
        // System.out.println("Will we see this? :( Probably not, right - top to bottom this exception is above us down here, what do you think?"); // Unreachable code after exception!

        //So: We see that we can throw an exception and that we immediately break our application with that exception
        //The question arises: How do we actually program an unhappy path that follows an exception being thrown?
        //try {//code that might break} catch (someKindOfException){ //code for Java to do after break}

//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            //System.out.println("I can divide by zero!");
//            System.out.println("result = " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("User attempted to divide by 0!");
//            e.printStackTrace(System.out);
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            // expand down the line - moving towards less specificity with each Catch block{}
//        }

        // an example of an array

        int[] numbers = {1, 2, 3};
        int x;

        try {
            x = numbers[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an array index exception!");
            x = 0;
        } catch (Exception e) {
            System.out.println("Caught a generic exception!");
            e.printStackTrace();
        } finally {
            System.out.println("This will always run. [For example: 'I have completed the operation message'] ");
        }

        // Real life scenario:
//        try {
//            //to connect to the database to get all of the user information
//            //OHHHH YEAH! IT WORKED: load in all the users, load in all of the posts/movies/coffees/whatever is going on in your application
//            //proceed as normal...
//        } catch (SomethingWrong


    }

}
