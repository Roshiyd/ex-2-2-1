package uz.pdp.ex221.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.ex221.entity.Attachment;
import uz.pdp.ex221.entity.AttachmentContent;

import javax.persistence.OneToOne;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();

    byte[] getBytes();

    Attachment getAttachment();
}
