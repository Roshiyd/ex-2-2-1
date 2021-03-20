package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean getActive();
}
