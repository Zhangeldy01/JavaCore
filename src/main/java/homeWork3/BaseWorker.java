package homeWork3;

/**
 * Абстрактный класс BaseWorker является базовым классом для всех сотрудников.
 * Он содержит общие поля и методы, которые должны быть реализованы в подклассах.
 */
public abstract class BaseWorker implements Comparable<BaseWorker> {
    protected String name;
    protected Double monthSalary;
    protected String positionEmployee;


    /**
     * Конструктор класса BaseWorker принимает имя, ежемесячную зарплату и должность сотрудника.
     *
     * @param name           имя сотрудника
     * @param monthSalary ежемесячная зарплата сотрудника
     * @param positionEmployee       должность сотрудника
     */
    public BaseWorker(String name, double monthSalary, String positionEmployee) {
        this.name = name;
        this.monthSalary = monthSalary;
        this.positionEmployee = positionEmployee;
    }


    /**
     * Абстрактный метод calculateAverageMonthlySalary должен быть реализован в подклассах
     * и должен возвращать среднюю ежемесячную зарплату сотрудника.
     *
     * @return средняя ежемесячная зарплата сотрудника
     */
    public abstract double countAverageMonthlySalary();

    public String getName() {
        return name;
    }

    public double getMonthlyPayment() {
        return monthSalary;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    /**
     * Метод compareTo сравнивает текущий объект BaseWorker с переданным объектом o
     * на основе значения поля monthlyPayment.
     *
     * @param o объект для сравнения
     * @return отрицательное значение, если текущий объект меньше переданного,
     * положительное значение, если текущий объект больше переданного,
     * нуль, если объекты равны
     */
    @Override
    public int compareTo(BaseWorker o) {
        return this.monthSalary.compareTo(o.monthSalary);
    }
}