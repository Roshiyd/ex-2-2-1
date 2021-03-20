package uz.pdp.ex221.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ex221.entity.Attachment;
import uz.pdp.ex221.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

}
