package pl.dw.cleanview.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private String descId;

    @Column
    private String description;

    @Column
    private String education;

    @OneToOne
    @JoinColumn(name = "aid")
    private Address aid;
}
