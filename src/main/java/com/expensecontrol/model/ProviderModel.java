package com.expensecontrol.model;


import com.expensecontrol.enums.ServiceProvidedEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "provider")
public class ProviderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer pk;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 150)
    private String address;

    @Enumerated(EnumType.STRING)
    private ServiceProvidedEnum serviceProvided;

    @Column(length = 150)
    private String description;
}
