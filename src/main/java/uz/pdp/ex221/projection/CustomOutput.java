package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Client;
import uz.pdp.ex221.entity.Currency;
import uz.pdp.ex221.entity.Output;
import uz.pdp.ex221.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
