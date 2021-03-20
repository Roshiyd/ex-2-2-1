package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();
}
