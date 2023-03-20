package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String filename;
    private Double filesize;
    private String filepath;
    private String filetype;

    public FileUploaded(File aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}
