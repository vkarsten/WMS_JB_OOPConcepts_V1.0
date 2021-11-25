package main.java.data;

import java.util.List;

public class User {
    protected String name = "Anonymous";
    private boolean isAuthenticated = false;

    public User(String userName) {
        this.name = userName;
    }

    public String getName() {
        return name;
    }

    public boolean authenticate(String passsword) {
        return false;
    }

    public boolean isNamed(String name) {
        return name.equals(this.name);
    }

    public void greet() {
        System.out.printf("Hello%s!\nWelcome to our Warehouse Database.\nIf you don't find what you are looking for," +
                "\nplease ask one of our staff members to assist you.\n", showUserName());
    }

    public void bye(List<String> actions) {
        System.out.printf("Thank you for your visit%s!\n", showUserName());
    }

    private String showUserName() {
        return (name.equals("Anonymous")) ? "" : (", ".concat(name));
    }
}
