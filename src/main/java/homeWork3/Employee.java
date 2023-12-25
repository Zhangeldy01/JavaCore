package homeWork3;

import java.util.Iterator;
import java.util.List;

public class Employee implements Iterable<BaseWorker> {
    private final List<BaseWorker> workers;

    /**
     * Конструктор, принимающий список сотрудников компании.
     * @param workers список сотрудников компании
     */
    public Employee(List<BaseWorker> workers) {
        this.workers = workers;
    }

    /**
     * Возвращает итератор для обхода коллекции сотрудников.
     * @return итератор для обхода коллекции сотрудников
     */
    @Override
    public Iterator<BaseWorker> iterator() {
        return new WorkerIterator();
    }

    /**
     * Внутренний класс, реализующий итератор для коллекции сотрудников.
     */
    private class WorkerIterator implements Iterator<BaseWorker> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < workers.size();
        }

        @Override
        public BaseWorker next() {
            return workers.get(currentIndex++);
        }
    }

}
