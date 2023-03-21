package googledrive.domain;

import googledrive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String video url;
}
