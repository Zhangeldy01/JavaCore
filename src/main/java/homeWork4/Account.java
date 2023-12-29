package homeWork4;

/* Task #1. Создать программу управления банковским счетом (Account).
  Программа должна позволять пользователю вводить начальный баланс счета, сумму депозита и сумму снятия средств. При этом она должна обрабатывать следующие исключительные ситуации:
  Попытка создать счет с отрицательным начальным балансом должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
  Попытка внести депозит с отрицательной суммой должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
  Попытка снять средства, сумма которых превышает текущий баланс, должна вызывать исключение InsufficientFundsException с сообщением о недостаточных средствах и текущим балансом.
  Продемонстрируйте работу вашего приложения:
  Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.

   Task #2*.
  Создать несколько типов счетов, унаследованных от Account, например: CreditAcciunt, DebitAccount.
  Создать класс (Transaction), позволяющий проводить транзакции между счетами (переводить сумму с одного счета на другой)
  Класс Transaction должен возбуждать исключение в случае неудачной попытки перевести деньги с одного счета на другой.
  Продемонстрируйте работу вашего приложения:
  Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.
*/
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

