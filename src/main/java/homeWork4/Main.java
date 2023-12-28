package homeWork4;

import java.sql.SQLOutput;

/**
 * Точка входа в программу.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Example 1
            Account account = new Account(100500.0);
            System.out.println("Начальный баланс: " + account.getBalance() + " рублей.");
            account.deposit(50600.0);
            System.out.println("Баланс после внесения депозита: " + account.getBalance() + " рублей.");
            account.withdraw(95000.0);
            System.out.println("Баланс после снятия средств: " + account.getBalance() + " рублей.");
            System.out.println();

            // Example 2
//            Account account1 = new Account(-50); // Выдаст ошибку: "Невозможно создать счет с начальным отрицательным балансом."
//            System.out.println("Начальный баланс: " + account1.getBalance() + " рублей.");
//            System.out.println();
//            account1.deposit(80000.0);
//            System.out.println("Баланс после внесения депозита: " + account1.getBalance() + " рублей.");
//            account1.withdraw(100000.0);
//            System.out.println("Баланс после снятия средств: " + account1.getBalance() + " рублей.");

            // Example 3
            Account account2 = new Account(12000.0);
            System.out.println("Начальный баланс: " + account2.getBalance() + " рублей.");
            account2.deposit(80000.0);
            System.out.println("Баланс после внесения депозита: " + account2.getBalance() + " рублей.");
            account2.withdraw(100000.0);
            System.out.println("Баланс после снятия средств: " + account2.getBalance() + " рублей.");
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
