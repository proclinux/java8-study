import lombok.Data;

import java.time.LocalDate;

/**
 * @author 倦鸟
 */
@Data
public class MemberDO {

    private String name;

    private Integer age;

    private LocalDate birthday;
}
