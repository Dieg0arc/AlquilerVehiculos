package cue.edu.co.miniproyecto2.repositories;

import java.sql.SQLException;
import java.util.List;

public interface Repository <T>{
    List<T> list() throws SQLException;
    T byId(int id);
    void save(T t);
    void delete(int id);
    void update(T t);
}
