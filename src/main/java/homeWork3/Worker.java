package homeWork3;

public class Worker extends BaseWorker {

    private double fixedMonthlySalary;
    public Worker(String name, double monthSalary, String positionEmployee) {

        super(name, monthSalary, positionEmployee);
    }

    @Override
    public double countAverageMonthlySalary() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return "\n" + "BaseWorker: " +
                "name = " + name  +
                ", monthSalary = " + monthSalary +
                ", positionEmployee = " + positionEmployee +
                '.' + "\n";
    }
}
