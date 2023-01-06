package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentServiceImpl implements DataService{

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public void read(User user) {
        ReaderFromTxt.read(user);


    }
}
