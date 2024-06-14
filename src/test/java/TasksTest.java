import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
public class TasksTest {

    @Test
    public void searchEpic1() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);


        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchEpic2() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);


        boolean expected = false;
        boolean actual = epic.matches(" картофель");

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void searchSimpleTask1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchSimpleTask2() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean expected = false;
        boolean actual = simpleTask.matches("Написать");
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void searchMeeting1() {


        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches(" среда");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void searchMeeting2() {


        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );


        boolean expected = true;
        boolean actual = meeting.matches("вторник");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void searchMeeting3() {


        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );


        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");

        Assertions.assertEquals(expected, actual);
    }
}







