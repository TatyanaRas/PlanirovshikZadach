import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class todosTest {

    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        simpleTask simpleTask = new simpleTask(5, "Позвонить родителям");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
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

        task[] expected = { simpleTask, epic, meeting };
        task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
