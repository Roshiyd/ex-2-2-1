package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Input;
import uz.pdp.ex221.entity.InputProduct;
import uz.pdp.ex221.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
