package cue.edu.co.miniproyecto2.service;

import java.sql.SQLException;
import java.util.List;

public interface VehicleService<T> {
    List<T> listStudent() throws SQLException;
}
