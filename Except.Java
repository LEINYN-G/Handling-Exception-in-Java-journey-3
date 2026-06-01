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
