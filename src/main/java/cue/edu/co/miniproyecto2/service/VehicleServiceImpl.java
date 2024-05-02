package cue.edu.co.miniproyecto2.service;

import cue.edu.co.miniproyecto2.confing.DataBaseConnection;
import cue.edu.co.miniproyecto2.repositories.impl.RepositoryJDBCImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class VehicleServiceImpl implements VehicleService{
    Connection conn = DataBaseConnection.getInstance();
    private RepositoryJDBCImpl studentRepository;

    public VehicleServiceImpl() throws SQLException{
        this.studentRepository = new RepositoryJDBCImpl();
    }

    @Override
    public List listStudent() throws SQLException {
        return studentRepository.list();
    }

}