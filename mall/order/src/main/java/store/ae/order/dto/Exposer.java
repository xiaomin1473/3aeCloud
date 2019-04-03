package store.ae.order.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Exposer<T> {

    /**
     * 状态码
     */
    @SerializedName("code")
    private int code;

    /**
     * 信息
     */
    @SerializedName("msg")
    private String msg;

    /**
     * 返回api
     */
    @SerializedName("data")
    private T data;

    public Exposer(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Exposer(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
