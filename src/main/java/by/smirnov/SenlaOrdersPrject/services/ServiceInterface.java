package by.smirnov.SenlaOrdersPrject.services;

import java.util.List;

public interface ServiceInterface {
    List<?> getAll();
    Object getOne(Object o);
    void save();

    void update(Object o, int id);

    void delete(int id);
}
