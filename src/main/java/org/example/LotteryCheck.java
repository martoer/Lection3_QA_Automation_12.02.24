package org.example;

public class LotteryCheck {
    public static void main(String[] args) {
        checkLottery ("Lottery", "Lottery");
        checkLottery ("Lottery", "Lfwjdbw");

    }
    public static void checkLottery (String text, String text2){
        if (text.equals(text2)){
            System.out.println("Вие печелите голямата награда");
        } else {
            System.out.println("Опитай пак");
        }
    }
}
