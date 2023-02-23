package pl.dw.cleanview.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long cid;

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
    @JoinColumn(name = "fid")
    private File fid;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
