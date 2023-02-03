package view;

import data.User;

import java.util.List;

public abstract class UserView {
    private Object user;

    public void showTheBest(List<User> userList) {
        findTheBest(userList);
        System.out.println(user);

    }

    protected abstract User findTheBest(List<User> userList);

}
