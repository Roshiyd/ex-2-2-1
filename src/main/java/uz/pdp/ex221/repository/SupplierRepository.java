package uz.pdp.ex221.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ex221.entity.Supplier;
import uz.pdp.ex221.projection.CustomSupplier;
import uz.pdp.ex221.projection.CustomUser;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
