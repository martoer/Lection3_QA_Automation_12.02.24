package org.example;

public class CheckPriceBoolean {
    public static void main(String[] args) {
        boolean isValidPrice = checkPrice(1, 3);
        boolean isValidPrice2 = checkPrice(1, 3);
        // boolean isValidPrice3 = checkPrice(3, 3);
        //  boolean isValidPrice4 = checkPrice(-1, -4);

       /* if (isValidPrice) {
            System.out.println("This is yes");
        } else {
            System.out.println("This is no");
        }*/
        if (isValidPrice || isValidPrice2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean checkPrice (int number1, int number2){
        if (number1 > number2) {
            return true;
        } else {
            return false;
        }
    }
}
