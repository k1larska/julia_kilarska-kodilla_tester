public class Application {
    public static class User {
        private String name;
        private double age;
        private double height;

        public User(String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public boolean OlderThan30AndTallerThan160() {
            return age > 30 && height > 160;
        }
    }
        public static void main(String[] args) {
            User adam = new User("Adam", 40.5, 178);

            if (adam != null) {
                if (adam.OlderThan30AndTallerThan160()) {
                    System.out.println("User is older than 30 and taller than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }
}