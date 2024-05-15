package com.expensecontrol.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProviderDTO {

    @EqualsAndHashCode.Include
    private Integer pk;

    private String name;

    private String serviceProvided;

    private String description;

    private String address;
}
