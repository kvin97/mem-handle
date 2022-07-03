package com.memory.memhandle.models;

import java.util.ArrayList;
import java.util.List;

public class StaticUsers {
    private static List<User> users = new ArrayList<>();

    public static void setStaticUsers(User user){
        users.add(user);
    }
}
