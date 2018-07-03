package techForce.mailru.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.File;

@Data
@Accessors(chain = true)
public class MailData {

    String to;
    String theme;
    File attache;
}
