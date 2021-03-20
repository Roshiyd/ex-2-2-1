package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Client;

import javax.persistence.Column;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getName();

    String getPhoneNumber();
}
