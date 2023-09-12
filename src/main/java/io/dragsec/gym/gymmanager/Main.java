package io.dragsec.gym.gymmanager;

import io.dragsec.gym.gymmanager.model.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        User user = new User("Alex", "Rossi", 20);
        System.out.println(user);
        User user2 = new User("Nico", "Rogai", 31);
        System.out.println(user2);
        String persona1Nome = user.firstname;
    }
}
