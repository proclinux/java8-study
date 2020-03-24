import lombok.Data;

import java.time.LocalDate;

/**
 * @author 倦鸟
 */
@Data
public class MemberDTO {

    private String memberName;

    private Integer memberAge;

    private LocalDate birthday;
}
