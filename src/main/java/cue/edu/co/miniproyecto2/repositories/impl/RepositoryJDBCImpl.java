package cue.edu.co.miniproyecto2.repositories.impl;

import cue.edu.co.miniproyecto2.mapping.dtos.VehicleDTO;
import cue.edu.co.miniproyecto2.mapping.mappers.Mapper;
import cue.edu.co.miniproyecto2.model.Vehicle;
import cue.edu.co.miniproyecto2.repositories.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositoryJDBCImpl implements Repository<VehicleDTO> {
    private Connection conn;

    private Vehicle createStudent(ResultSet resultSet) throws SQLException {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(resultSet.getLong("Id"));
        vehicle.setName(resultSet.getString("nombre"));
        vehicle.setType(resultSet.getString("Tipo"));
        vehicle.setAvailability(resultSet.getBoolean("disponible"));
        return vehicle;
    }

    @Override
    public List<VehicleDTO> list() throws SQLException {
        List<VehicleDTO> vehicle = new ArrayList<>();
        try (Statement stmt= conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from vehicles")){
            while (rs.next()){
                Vehicle vehicles = createvehicles(rs);
                VehicleDTO vehicleDto = Mapper.mapFromModel(vehicles);
                vehicle.add(vehicleDto);
            }
            return vehicle;
        }
    }

    @Override
    public VehicleDTO byId(int id) {
        return null;
    }

    @Override
    public void save(VehicleDTO vehicleDTO) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(VehicleDTO vehicleDTO) {

    }


    private Vehicle createvehicles(ResultSet rs)
    {
        return null;
    }
}

