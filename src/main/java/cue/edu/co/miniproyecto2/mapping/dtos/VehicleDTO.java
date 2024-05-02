package cue.edu.co.miniproyecto2.mapping.dtos;

import lombok.Builder;

@Builder

public record VehicleDTO(Long id, String name, String type, int price, boolean available) {

}
