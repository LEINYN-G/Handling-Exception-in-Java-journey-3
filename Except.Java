public class Handling {
    public static void main(String[] args) {
        try {// try-block starts
            int num1, num2, result;
        num1 = 5;
        num2 = 0;
        result = num1/num2;
        System.out.println("Division is" + result);
    } catch (ArithmeticException e) {//catch-block starts
        System.out.println("You could divide a number by zero.");
      }
    }
}  /*Instead of breaking the execution flow and throwing some technical error message, we have
   handled the exception and as a result, we have displayed a meaningful message for the user.*/

//Let's take another example
public class Handling {
  public static void main(String[] args) {
int[] myNumbers = {1,2,3,4,5};
System.out.println(myNumbers[5]);
 }
}

/*Here, we are trying to access the element at an index that does not exist. In such cases, the program will generate
an exception called ArrayIndexOutOfBoundsException which needs to be handled.*/
//output
/*Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException: Index 5
out of bounds for length 5
at Handling.main(Handling.java:4)*/
//1) Implementing getMessage
public class Handling{
  public static void main(String[] args) {
   try {
    int[] myNumbers = {1,2,3,4,5};
    System.out.println(myNumbers[5]);
   } catch(ArrayIndexOutOfBoundsException e) {
     System.out.println(e.getMessage());  //Using getMessage() here
  }
 }
} 
//output: Index 5 out of bounds for length 5

//2) Implementing printStackTrace
public class Handling {
 public static void main(String[] args) {
  try {
   int[] myNumbers = {1,2,3,4,5};
   System.out.println(e.getMessage());
   e.printStackTrace();  //Using printStackTrace() here
  }
 }
} 
/* output: Index 5 out of bounds for length 5
java.lang.ArrayIndexOutOfBoundsException: Index 5
out of bounds for length 5
at Handling.main(Handling.java:5) */
