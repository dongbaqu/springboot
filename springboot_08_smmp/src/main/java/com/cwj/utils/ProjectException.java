package com.cwj.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 曹文境~
 */
//为springMVC处理异常
@RestControllerAdvice
public class ProjectException {
    //拦截所有的异常信息
    @ExceptionHandler
    public R doException(Exception exception){
        exception.getStackTrace();
        return new R("服务器异常,请稍后再试!");
    }
}
