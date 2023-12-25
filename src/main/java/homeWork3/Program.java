package homeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<BaseWorker> workers = new ArrayList<>();
        workers.add(new Worker("Муратов Денис", 158356.46, "Аналитик данных Big Data"));
        workers.add(new Worker("Солопов Андрей", 82150.00, "Тестировщик"));
        workers.add(new Worker("Жукова Дарья", 125600.00, "Бэкенд разработчик"));
        workers.add(new Freelancer("Абдуллов Роман", 750, "Веб-разработчик"));
        workers.add(new Freelancer("Карпова Елена", 790, "Бизнес-аналитик"));

        Employee employees = new Employee(workers);

        for (BaseWorker wr : employees) {
            System.out.println(wr.getName() + ": " + wr.countAverageMonthlySalary());
        }
        System.out.println();

        Collections.sort(workers, new ComparatorPosition());
        System.out.println("Отсортированный список работников по должности" + workers);

        System.out.println();

         // Сортируем список работников по среднему месячному заработку, используя естественный порядок сортировки (Comparable)
        Collections.sort(workers);
        System.out.println("Отсортированный список работников по среднему месячному заработку" + workers);

    }
}
