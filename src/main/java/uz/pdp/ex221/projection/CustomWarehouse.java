package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();

    String getName();

    boolean getActive();
}
