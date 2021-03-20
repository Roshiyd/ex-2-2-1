package uz.pdp.ex221.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String password;

    private boolean active=true;

    @ManyToMany
    private Set<Warehouse> warehouses;
}
