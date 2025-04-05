class User {
    private String username;
    private String password;

    public void register(String user, String pass) {
        username = user;
        password = pass;
    }

    public boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }
}

public class Main19 {
    public static void main(String[] args) {
        User u = new User();
        u.register("admin", "admin123");

        System.out.println("Login success: " + u.login("admin", "admin123"));
        System.out.println("Login failed: " + u.login("admin", "wrongpass"));
    }
}
