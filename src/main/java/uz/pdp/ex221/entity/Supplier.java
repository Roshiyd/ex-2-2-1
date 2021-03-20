package uz.pdp.ex221.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.ex221.entity.template.AbsEntity;


import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier extends AbsEntity {
    private Integer id;

    private String name;

    private boolean active=true;

    private String phoneNumber;
}
