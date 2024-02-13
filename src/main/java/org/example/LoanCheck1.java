package org.example;

public class LoanCheck1 {
    public static void main(String[] args) {

        calculateCreditDetails("Martin", 18, 30000, 9);
        calculateCreditDetails("Georgi", 12, 30000, 9);
        calculateCreditDetails("Martin", 34, 1000, 13);
        calculateCreditDetails("Martin", 34, 20000, 23);
        calculateCreditDetails("Martin", 34, 20000, 5);
        calculateCreditDetails("Martin", 34, 999, 13);
    }

    public static void calculateCreditDetails(String fullName, int age, int amount, int months) {
        if (age < 18) {
            System.out.println("Трябва да имате навършени 18 години, за да изтеглите кредит");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("Не може да изтеглите тази сумаза за такъв период");
                } else {
                    double monthlyPyament = (double) amount / months;
                    System.out.println("Месечна вноска е равна на " + monthlyPyament);
                }
            } else {
                double interestRate = getInterestRate(amount);
                double totalAmount = amount + (amount * interestRate * months / 12);
                double monthlyPayment = totalAmount / months;
                System.out.printf("Месечна вноска за сума от %d лева за %d месеца " +
                        "с лихва %.2f%% e %.2f лева.%n", amount, months, interestRate * 100, monthlyPayment);
            }


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