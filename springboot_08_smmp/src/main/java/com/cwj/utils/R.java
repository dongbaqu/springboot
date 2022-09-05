package com.cwj.utils;

import lombok.Data;

/**
 * @author 曹文境~
 */
@Data
public class R {
    private Boolean flag = false;
    private Object data;
    private String message;

    public R() {
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public R(String message) {
        this.flag = false;
        this.message = message;
    }
}
