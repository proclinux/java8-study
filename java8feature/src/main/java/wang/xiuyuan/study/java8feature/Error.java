package wang.xiuyuan.study.java8feature;

/**
 * <p>
 * Happy work, happy live
 * </p>
 *
 * @author proc
 * @since 2019/11/28
 */
public interface Error {

    String getErrorCode();

    String getErrorMessage();

    default String getLastErrorCode() {

        return "11" + this.getErrorCode();
    }
}
