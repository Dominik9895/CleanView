package pl.dw.cleanview.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private String did;

    @Column
    @NotEmpty(message = "First name cannot be empty or null")
    private String firstName;

    @Column(unique = true)
    @NotEmpty(message = "Last name cannot be empty or null")
    private String lastName;

    @Column(unique = true)
    @NotEmpty(message = "Email address cannot be empty or null")
    private String email;

    @Column(unique = true)
    @NotEmpty(message = "Phone number cannot be empty or null")
    private String phone;


    @OneToOne
    @JoinColumn(name = "descId")
    private Description descId;

    @OneToMany
    @JoinColumn(name = "oid")
    private List<Opinions> oid;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
