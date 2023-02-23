package pl.dw.cleanview.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long aid;
    @Column
    @NotEmpty(message = "City cannot be empty")
    private String city;
    @Column
    @NotEmpty(message = "Street cannot be empty")
    private String street;
    @Column
    @NotEmpty(message = "Building number cannot be empty")
    private String buildingNumber;
    @Column
    private String apartmentNumber;
    @Column
    @NotEmpty(message = "Postal code cannot be empty")
    private String postalCode;
}
