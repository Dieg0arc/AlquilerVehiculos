package cue.edu.co.miniproyecto2.mapping.mappers;

import cue.edu.co.miniproyecto2.mapping.dtos.VehicleDTO;
import cue.edu.co.miniproyecto2.model.Vehicle;

public class Mapper {

    public static VehicleDTO mapFromModel(Vehicle vehicles) {
        return new VehicleDTO(vehicles.getId(), vehicles.getName(), vehicles.getType(), vehicles.getPrice(), vehicles.isAvailability());
    }

    public static Vehicle mapFromDTO(VehicleDTO vehicles) {
        return Vehicle.builder()
                .id(vehicles.id())
                .name(vehicles.name())
                .type(vehicles.type())
                .price(vehicles.price())
                .availability(vehicles.available())
                .build();
    }
}