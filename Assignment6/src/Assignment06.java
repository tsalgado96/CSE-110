// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 6
// Author      : Teodoro Salgado 1220358243
// Description : Practice manipulating arrays and writing methods that take arrays as parameters

public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
        // 1)
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        printArray(myArray, " - ");
        System.out.println();
        // 2)
        System.out.println(getFirst(myArray));
        // 3)
        System.out.println(getLast(myArray));
        // 4)
        for (int item: getAllButFirst(myArray)){
            System.out.print(item + " ");
        }
        System.out.println();
        // 5)
        int[] myArray5 = {333, 22, 1, 400, 5005, 9};
        System.out.println(getIndexOfMin(myArray5));
        // 6)
        int[] myArray6 = {1, 22, 333, 400, 5005, 9};
        System.out.println(getIndexOfMax(myArray6));
        // 7)
        int[] myArray7 = {1, 22, 333, 400, 5005, 9};
        swapByIndex(myArray7, 1, 4);
        for (int item: myArray7)
            System.out.print(item + " ");
        System.out.println();
        // 8)
        int[] myArray8 = {1, 22, 333, 400, 5005, 9};
        for (int item: removeAtIndex(myArray8, 3))
            System.out.print(item + " ");
        System.out.println();
        // 9)
        int[] myArray9 = {1, 22, 333, 400, 9};
        for (int item: insertAtIndex(myArray9, 2, 777))
            System.out.print(item + " ");
        System.out.println();
        // 10)
        int[] myArray10 = {22, 5005, 400, 333, 1, 9};
        System.out.println(isSorted(myArray10));
        int[] myArray11 = {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(myArray11));

    }

    // 1) Write a public static method named printArray,
    //   that takes two arguments. The first argument is an Array of int
    //   and the second argument is a String. The method should print out
    //   a list of the values in the array, each separated by the value of the second argument.
    public static void printArray(int[] arr, String str) {
        for (int i = 0; i < arr.length; i++){
            // Does not add the separating value if it's the last item in the array
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + str);
            }
        }
    }


    // 2) Write a public static method named getFirst,
    //    that takes an Array of int as an argument and returns
    //    the value of the first element of the array.
    public static int getFirst(int[] arr) {
        return arr[0];
    }


    // 3) Write a public static method named getLast,
    //    that takes an Array of int as an argument and returns
    //    the value of the last element of the array.
    public static int getLast(int[] arr) {
        return arr[arr.length - 1];
    }


    // 4) Write a public static method named getAllButFirst,
    //    that takes an Array of int as an argument and creates and returns
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int[] arr) {
        // Declares a new array with length one less than the argument array
        int[] rt = new int[arr.length - 1];
        // Starts the loop at index 1 to skip over the first element
        for (int i = 1; i < arr.length; i ++)
            rt[i - 1] = arr[i];
        return rt;
    }

    // 5) Write a public static method named getIndexOfMin,
    //    that takes an Array of int as an argument and returns
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] arr) {
        // min is initialized to the first element of the array
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            // If the element at index i is less than the current min it will replace it
            // Keeps track of the index of the min
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    // 6) Write a public static method named getIndexOfMax,
    //    that takes an Array of int as an argument and returns
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int[] arr) {
        // max is initialized to the first element of the array
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            // If the element at index i is greater than the current max it will replace it
            // Keeps track of the index of the max
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }


    // 7) Write a public static method named swapByIndex,
    //    that takes three arguments. The first argument is an Array of int,
    //    and the second and third arguments are int indexes.
    //    This method will swap the values at the two given index arguments
    //    in the array, and return a reference to the array.
    public static int[] swapByIndex(int[] arr, int a, int b) {
        // Declares a new variable rt that is a reference to the array
        int[] rt = arr;
        int x = arr[a];
        int y = arr[b];
        rt[a] = y;
        rt[b] = x;
        // Returns the reference
        return rt;
    }


    //8) Write a public static method named removeAtIndex,
    //  that takes two arguments. The first argument is an Array of int,
    //  and the second argument is an int index. This method create and return
    //  a new array with all of the values in the argument array
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] arr, int index) {
        // Declares new array with length one less than the argument array
        int[] rt = new int[arr.length - 1];
        // i is the index counter for arr
        // j is the index counter for rt
        for (int i = 0, j = 0; i < arr.length; i++){
            // j will not increment when i is equal to the argument index, thus not going out of bounds
            if (i != index) {
                rt[j++] = arr[i];
            }
        }
        return rt;
    }


    //9) Write a public static method named insertAtIndex,
    //   that takes three arguments. The first argument is an Array of int,
    //   the second argument is an int index, and the third argument is an int value.
    //   This method create and return a new array with all of the values
    //   in the argument array and including the third argument value
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] arr, int index, int value) {
        // Declares new array with length one more than the argument array
        int[] rt = new int[arr.length + 1];
        // i is the index counter for arr
        // j is the index counter for rt
        for (int i = 0, j = 0; i < arr.length; i++, j++){
            // j will increment twice in the loop cycle when i is equal to the argument index
            if (i == index) {
                rt[j++] = value;
            }
            rt[j] = arr[i];
        }
        return rt;
    }

    //10) Write a public static method named isSorted,
    //    that takes an Array of int as an argument.
    //    This method should return the boolean value true
    //    if all the element values in the array are in ascending order;
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            // Break out of the loop if index is on the last element of the array to avoid out of bounds
            if (i == arr.length - 1)
                break;
            // Compares index i with i+1 and returns false if the value at index i is greater than i+1
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        // Default returns true if for loops completes without returning
        // Means that the elements in the array are in ascending order
        return true;
    }
}
