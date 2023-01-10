package service;

import data.User;

import java.io.IOException;

public interface DataService {
    void create(User user) throws IOException;
    void read(User user) throws IOException;

}
