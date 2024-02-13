package org.example;

public class LoanCheck1 {
    public static void main(String[] args) {

        calculateCreditDetails("Martin", 18, 100000, 9, 1200);
        calculateCreditDetails("Georgi", 19, 70000, 9, 2100);
        calculateCreditDetails("Martin", 34, 1000, 13, 3500);
        calculateCreditDetails("Martin", 34, 20000, 23, 1500);
        calculateCreditDetails("Martin", 34, 20000, 5, 1250);
        calculateCreditDetails("Martin", 34, 999, 13, 2000);
    }

    public static void calculateCreditDetails(String fullName, int age, int amount, int months, int monthlyIncome) {
        if (age < 18) {
            System.out.println("Трябва да имате навършени 18 години, за да изтеглите кредит");
        } else if (amount < 1000) {
            if (months > 12) {
                System.out.println("Не може да изтеглите тази сумаза за такъв период");
            } else {
                double monthlyPyament = (double) amount / months;
                System.out.println("Месечна вноска е равна на " + monthlyPyament);
            }
        } else if (amount > 50000) {
            if (monthlyIncome < 2000) {
                System.out.println("Съжаляваме, но максимума за такъв доход е 20000 лева");
            }
        } else if (monthlyIncome > 5000) {
            if (amount < 100000) {
                System.out.println("С такъв доход можем да ви предложим 100 000 лева");
            }
        } else {
            double interestRate = getInterestRate(amount);
            double totalAmount = amount + (amount * interestRate * months / 12);
            double monthlyPayment = totalAmount / months;
            System.out.printf("Месечна вноска за сума от %d лева за %d месеца " +
                    "с лихва %.2f%% e %.2f лева.%n", amount, months, interestRate * 100, monthlyPayment);
        }


    }





public static double getInterestRate(int amount) {
    if (amount <= 5000) {
        return 0.05;                // 5% lihva za sumi do 5000 leva
    } else if (amount <= 10000) {
        return 0.04;                // 4% lihva za sumi do 10 000 leva
    } else {
        return 0.033;
    }
}
}