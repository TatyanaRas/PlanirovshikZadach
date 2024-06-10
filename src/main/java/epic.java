import java.util.Objects;

public class epic extends task {
    protected String title;

    public epic(int id, String subtasks[]) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}
