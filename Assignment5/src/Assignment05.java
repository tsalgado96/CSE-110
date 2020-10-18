// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 5
// Author      : Teodoro Salgado 1220358243
// Description : Practice writing methods with parameters

public class Assignment05 {
    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
        // 1)
        displayGreeting();
        // 2)
        displayText("abc" + "123");
        // 3)
        printTotal(100, 23, 2);
        // 4)
        System.out.println(getTotal(100, 23, 2));
        // 5)
        System.out.println(getAverage(0, 1, 3));
        // 6)
        System.out.println(averageLength("wednesday", "tuesday", "monday"));
        // 7)
        System.out.println(lengthOfShortest("thursday", "friday"));
        // 8)
        System.out.println(stringOfStars("abc"));
        // 9)
        System.out.println(maxStringOfStars("thursday", "friday"));
        // 10)
        System.out.println(midStringOfStars("123456", "12", "1234"));

    }

    // 1) Write (define) a static method named displayGreeting,
    //  that takes no arguments and returns no value.
    //  When this function is called, it should print the text "Hello, and welcome!".
    static void displayGreeting(){
        System.out.println("Hello, and welcome!");
    }


    //2) Write (define) a static method named displayText,
    //  that takes a single String argument and returns no value.
    //  When this function is called, it should print the value of the argument that was passed to it.
    static void displayText(String arg){
        System.out.println(arg);
    }


    //3) Write (define) a static method named printTotal,
    //  that takes three int arguments.
    //  When this function is called, it should print the sum of the three arguments passed to it.
    //  This function should return no value.
    static void printTotal(int a, int b, int c){
        System.out.println(a + b + c);
    }


    //4) Write (define) a static method named getTotal,
    //  that takes three int arguments.
    //  When this function is called, it should return the sum
    //  of the three arguments passed to it as an int.
    static int getTotal(int a, int b, int c){
        return a + b + c;
    }


    //5) Write (define) a static method named getAverage,
    //  that takes three int arguments.
    //  When this function is called, it should return the average
    //  of the three arguments passed to it as a double.
    static double getAverage(int a, int b, int c){
        return ((double)a + (double)b + (double)c) / 3;
    }


    //6) Write (define) a static method named averageLength,
    //  that takes three String arguments.
    //  When this function is called, it should return the average length (number of characters)
    //  of the String arguments passed to it as a double.
    static double averageLength(String a, String b, String c){
        return (a.length() + b.length() + c.length()) / 3.0;
    }


    //7) Write (define) a static method named lengthOfShortest,
    //  that takes two String arguments. When this function is called,
    //  it should return the length (number of characters)
    //  of the shortest String argument passed to it as an int.
    static int lengthOfShortest(String a, String b){
        if (a.length() > b.length())
            return b.length();
        else if (a.length() < b.length())
            return a.length();
        else
            return a.length();
    }


    //8) Write (define) a static method named stringOfStars,
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*)
    //  that is the same length as the string argument passed to it.
    static String stringOfStars(String a){
        String result = "";
        for (int i = 0; i < a.length(); i++)
            result += "*";
        return result;
    }


    //9) Write (define) a static method named maxStringOfStars,
    //  that takes two String arguments.
    //  When this function is called, it should return a String of asterisks (*)
    //  that is the same length as the longest string argument passed to it.
    static String maxStringOfStars(String a, String b){
        String result = "";
        if (a.length() > b.length()){
            for (int i = 0; i < a.length(); i++)
                result += "*";
        }
        else {
            for (int i = 0; i < b.length(); i++)
                result += "*";
        }
        return result;
    }


    //10) Write (define) a static method named midStringOfStars,
    //   that takes three String arguments.
    //   When this function is called, it should return a String of asterisks (*)
    //   that is the same length as the string argument with the length
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    static String midStringOfStars(String a, String b, String c){
        String result = "";
        // Checks if a is the middle number
        if ((a.length() > b.length() && a.length() < c.length()) || (a.length() > c.length() && a.length() < b.length())){
            for (int i = 0; i < a.length(); i++)
                result += "*";
        }

        // Checks if b is the middle number
        else if ((b.length() > a.length() && b.length() < c.length()) || (b.length() > c.length() && b.length() < a.length())){
            for (int i = 0; i < b.length(); i++)
                result += "*";
        }

        // c is the middle number
        else {
            for (int i = 0; i < c.length(); i++)
                result += "*";
        }
        return result;
    }
}
