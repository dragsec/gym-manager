package io.dragsec.gym.gymmanager.model;

public class User {
    public String firstname;
    public String lastname;
    public int age;

    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", eta=" + age +
                '}';
    }
}
