
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        User[] users = {
                new User("Anna", 20),
                new User("Betty", 33),
                new User("Carl", 58),
                new User("David", 13),
                new User("Eva", 18),
                new User("Frankie", 45),
        };

        int totalAge = 0;
        for (int i = 0; i < users.length; i++) {
            totalAge += users[i].getAge();
        }
        double avgAge = totalAge / users.length;
        System.out.println(avgAge);

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < avgAge) {
                System.out.println(users[i].getName());
            }
        }
    }

}


