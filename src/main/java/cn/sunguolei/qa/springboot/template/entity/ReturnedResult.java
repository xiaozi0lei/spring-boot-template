package cn.sunguolei.qa.springboot.template.entity;

import lombok.Data;

@Data
public class ReturnedResult<T> {
    private int code = 200;
    private String message;
    private T data;

    public ReturnedResult() {
    }

    private ReturnedResult(T data) {
        this.data = data;
    }

    private ReturnedResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static <T> ReturnedResult<T> success(T data) {
        ReturnedResult<T> result = new ReturnedResult<>(data);
        result.setCode(200);
        result.setMessage("成功");
        return result;
    }

    public static <T> ReturnedResult<T> fail(int code, String message) {
        return new ReturnedResult<>(code, message);
    }
}
