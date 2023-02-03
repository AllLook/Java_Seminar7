package db;

import java.util.ArrayList;
import java.util.List;

public abstract class Table<E> {
    protected List<E> elements;// поле типа List

    protected Table() {
        elements = new ArrayList<>();// в методе создаем обьект ArrayList

    }

    public E save(E entity) {
        elements.add(entity);// добавляем в лист пришедшее значение
        return entity;

    }

}
