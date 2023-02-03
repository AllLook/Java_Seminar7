package controller;

import data.User;

public interface UserController<T extends User, I> {
    T findByLastName(String LastName);
}
