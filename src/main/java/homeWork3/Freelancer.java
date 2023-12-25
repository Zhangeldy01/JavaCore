package homeWork3;

public class Freelancer extends BaseWorker{

    private double hourlyRate;
    public Freelancer(String name, double hourlyRate, String positionEmployee) {

        super(name, 0, positionEmployee);
        this.hourlyRate = hourlyRate;
        this.monthSalary = countAverageMonthlySalary();

    }
    @Override
    public double countAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;

    }
     public double getHourlyRate(){
        return hourlyRate;
     }

    @Override
    public String toString() {
        return "\n" + "BaseWorker: " +
                "name = " + name +
                ", monthSalary = " + monthSalary +
                ", positionEmployee = " + positionEmployee +
                '.' + "\n";
    }


}
