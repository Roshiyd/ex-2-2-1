package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.User;
import uz.pdp.ex221.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();

    Set<Warehouse> getWarehouses();
}
