package wang.xiuyuan.study.java8feature;

/**
 * <p>
 * Happy work, happy live
 * </p>
 *
 * @author proc
 * @since 2019/11/28
 */
public enum AppError implements Error {

    /**
     * 系统错误
     */
    SYSTEM_ERROR("10000", "系统异常");

    private String errorCode;
    private String errorMessage;

    AppError(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMessage = errorMsg;
    }

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMessage() {
        return this.errorMessage;
    }
}
