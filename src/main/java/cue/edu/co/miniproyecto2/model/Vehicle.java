package cue.edu.co.miniproyecto2.model;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Vehicle implements Serializable {
    private long id;
    private String name;
    private String type;
    private int price;
    private boolean availability;
}
