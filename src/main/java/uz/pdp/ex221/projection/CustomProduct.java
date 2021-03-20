package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Attachment;
import uz.pdp.ex221.entity.Category;
import uz.pdp.ex221.entity.Measurement;
import uz.pdp.ex221.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {
    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}
