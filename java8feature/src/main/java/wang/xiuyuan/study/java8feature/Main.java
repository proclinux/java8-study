package wang.xiuyuan.study.java8feature;

/**
 * <p>
 * Happy work, happy live
 * </p>
 *
 * @author proc
 * @since 2019/11/25
 */
public class Main {


    public static void main(String[] args) {

        Error sysError = AppError.SYSTEM_ERROR;

        System.out.print(sysError.getLastErrorCode());
    }
}
