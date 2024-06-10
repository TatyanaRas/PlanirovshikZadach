
import java.util.Objects;

public abstract class task {

    protected int id;
    protected String[] subtasks;
    protected String topic;

    public task(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        // Ниже находятся вспомогательные методы для корректной работы equals
        // Переопределять их в наследниках не нужно

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            task task = (task) o;
            return id == task.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

    public abstract boolean matches(String query);
}

