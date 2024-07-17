package org.example.java8Training.optinalclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optinalss {

    //optinal class is used to avoid null pointer exception

    private static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        Optional<User> user = Optional.empty();
        System.out.println("User is present: " + user.isPresent());

        Optional<User> user1 = Optional.of(new User("test"));
        System.out.println("User is present: " + user1.isPresent());


        //if user is not present then it will throw null pointer exception
        Optional<User> user2 = Optional.of(null);
        System.out.println("User is present: " + user2.isPresent());

    }

    public Optional<User> getUser(String name){
        return userList.stream().filter(user -> user.getName().equals(name)).findFirst();
    }
}
