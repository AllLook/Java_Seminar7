package repository;

import data.Student;
import data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    void delete(Student entry);

    E findByFio(String fio);
}
