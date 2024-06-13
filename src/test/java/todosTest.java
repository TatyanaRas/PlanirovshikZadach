import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class todosTest {

    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        simpleTask simpleTask = new simpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        epic epic = new epic(55, subtasks);

        meeting meeting = new meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos todos = new todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        task[] expected = {simpleTask, epic, meeting};
        task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchAllTasks1() {

        simpleTask simpleTask = new simpleTask(5, "Молоко купить ");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};

        epic epic = new epic(55, subtasks);

        meeting matches = new meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos todos = new todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(matches);

        task[] expected = {simpleTask, epic};
        task[] actual = todos.search("Молоко");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchAllTasks2() {

        simpleTask simpleTask = new simpleTask(5, "Позвонить родителям");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};

        epic epic = new epic(55, subtasks);

        meeting meeting = new meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos todos = new todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        task[] expected = {meeting};
        task[] actual = todos.search("вторник");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchAllTasks3() {

        simpleTask simpleTask = new simpleTask(5, "Позвонить родителям");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};

        epic epic = new epic(55, subtasks);

        meeting meeting = new meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos todos = new todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        task[] expected = {};
        task[] actual = todos.search("Помыть");
        Assertions.assertArrayEquals(expected, actual);
    }
}
