package com.urule.justin.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarInfo {
    private String bikeNo;
    private String gridGuid;
    private Integer status;
    private Double lat;
    private Double lng;
}
