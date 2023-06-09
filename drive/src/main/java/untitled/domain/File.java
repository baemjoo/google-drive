package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DriveApplication;
import untitled.domain.FileUploaded;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String filename;

    private Double filesize;

    private String filepath;

    private String filetype;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }
}
