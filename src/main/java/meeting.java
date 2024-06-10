
    public class meeting extends task {
        protected String title;

        public meeting(int id, String topic, String project, String start) {
            super(id); // вызов родительского конструктора
            this.topic = topic; // заполнение своих полей
        }

        public String getTopic() {
            return topic;
        }
      /**  @Override

        public boolean matches(String query) {
            if (topic.contains(query)) {
                return true;
            }
            if (project.contains(query)) {
                return true;
            }
            return false;
        }  добавила переопределение!!!!!*/
    }

