import java.util.Arrays;

public class meeting extends task {

    private String topic;
    private String project;
    private String start;

    public meeting(int id, String topic, String project, String start) {
        super(id); // вызов родительского конструктора
        this.topic = topic;
        this.project = project;
        this.start = start;// заполнение своих полей
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        if (start.contains(query)) {
            return true;
        }

        return false;
    }
}

