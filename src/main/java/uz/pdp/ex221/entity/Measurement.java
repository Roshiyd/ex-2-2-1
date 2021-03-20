package uz.pdp.ex221.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.ex221.entity.template.AbsEntity;


import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Measurement extends AbsEntity {

}
