public class todos {

    private task[] tasks = new task[0]; // <- тут будут все задачи

    /**
     * Вспомогательный метод для имитации добавления элемента в массив
     *
     * @param current Массив, в который мы хотим добавить элемент
     * @param task    Элемент, который мы хотим добавить
     * @return Возвращает новый массив, который выглядит как тот, что мы передали,
     * но с добавлением нового элемента в конец
     */
    private task[] addToArray(task[] current, task task) {
        task[] tmp = new task[current.length + 1];
        for (int i = 0; i < current.length; i++) {
            tmp[i] = current[i];
        }
        tmp[tmp.length - 1] = task;
        return tmp;
    }

    /**
     * Метод добавления задачи в список дел
     *
     * @param task Добавляемая задача
     */
    public void add(task task) { // <- вот здесь в параметре может лежать объект и вида SimpleTask, и вида Epic, и вида Meeting
        tasks = addToArray(tasks, task);
    }

    public task[] findAll() {
        return tasks;
    }

    /**
     * Метод, проверяющий подходит ли эта задача поисковому запросу.
     * Эта логика должна быть определена в наследниках, у каждого она будет своя
     *
     * @param query Поисковый запрос
     * @return Ответ на вопрос, подходит ли эта задача под поисковый запрос
     */
    public boolean matches(String query) {
        return false;
    }

    /**
     * Метод поиска задач, которые подходят под поисковый запрос
     *
     * @param query Поисковый запрос
     * @return Массив из подошедших задач
     */
    public task[] search(String query) {
        task[] result = new task[0]; // массив для ответа
        for (task task : tasks) { // перебираем все задачи
            if (task.matches(query)) { // если задача подходит под запрос
                result = addToArray(result, task); // добавляем её в массив ответа
            }
        }
        return result;
    }
}

