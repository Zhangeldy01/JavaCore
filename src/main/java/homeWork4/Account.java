package homeWork4;

public class Account {
    private double balance;

    /**
     * Конструктор для инициализации баланса счета.
     *
     * @param initialBalance начальный баланс счета
     * @throws IllegalArgumentException если начальный баланс отрицательный
     */
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Невозможно создать счет с начальным отрицательным балансом.");
        }
        this.balance = initialBalance;
    }

    /**
     * Метод для внесения денежного вклада на счет.
     *
     * @param amount сумма вклада
     * @throws IllegalArgumentException если сумма вклада отрицательная
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Невозможно внести депозит с отрицательной суммой");
        }
        this.balance += amount;
    }

    /**
     * Метод для снятия денег со счета.
     *
     * @param amount сумма для снятия
     * @throws InsufficientFundsException если недостаточно средств на счете
     */
    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Недостаточно средств для снятия. Текущий баланс: " + this.balance + " рублей.");
        }
        this.balance -= amount;
    }

    /**
     * Метод для получения текущего баланса счета.
     *
     * @return текущий баланс счета
     */
    public double getBalance() {
        return this.balance;
    }
}

