package utils;

public class ApiInvokeResult {

    private String code;

    private Object data;

    private String message;

    private boolean success;

    public void setData(Object data) {
        this.data = data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static ApiInvokeResult success(Object data, String code) {
        ApiInvokeResult result = new ApiInvokeResult();
        result.data = data;
        result.code = code;
        result.success = true;
        return result;
    }

    public static ApiInvokeResult success(String code) {
        ApiInvokeResult result = new ApiInvokeResult();
        result.code = code;
        result.success = true;
        return result;
    }

    public static ApiInvokeResult failure(String message, String code) {
        ApiInvokeResult result = new ApiInvokeResult();
        result.message = message;
        result.code = code;
        result.success = false;
        return result;
    }

    public Object getData() {
        return data;
    }


    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "ApiInvokeResult{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", success=" + success +
                '}';
    }

}
