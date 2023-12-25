package homeWork3;

import java.util.Comparator;


/** Класс PositionComparator реализует интерфейс Comparator<BaseWorker>
 * для сравнения объектов типа BaseWorker по полю position
 */
public class ComparatorPosition implements Comparator<BaseWorker> {
    //Comparator для сортировки списка или массива объектов по зарплате


        @Override
    public int compare(BaseWorker worker1, BaseWorker worker2) {
        return worker1.getPositionEmployee().compareTo(worker2.getPositionEmployee());
    }

}


