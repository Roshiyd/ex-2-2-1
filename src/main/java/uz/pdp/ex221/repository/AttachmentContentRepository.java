package uz.pdp.ex221.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.ex221.entity.AttachmentContent;
import uz.pdp.ex221.projection.CustomAttachmentContent;

import java.util.Optional;
@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "list",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

}
