package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DashBoard_table")
@Data
public class DashBoard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String filename;
    private String filesize;
    private String filepath;
    private String filetype;
    private String indexYn;
    private String uploadYn;
    private String videourl;
}
