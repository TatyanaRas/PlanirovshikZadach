
public class epic extends task {
    private String[] subtasks;


    public epic(int id, String subtasks[]) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {////
        return subtasks;
    }

    @Override
    public boolean matches(String query) {

        for (String subtask : subtasks) {

            if (subtask.contains(query)) {
                return true;

            }
        }
        return false;
    }


}

