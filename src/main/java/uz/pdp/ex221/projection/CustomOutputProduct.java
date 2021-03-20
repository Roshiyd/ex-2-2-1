package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Output;
import uz.pdp.ex221.entity.OutputProduct;
import uz.pdp.ex221.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();

}
