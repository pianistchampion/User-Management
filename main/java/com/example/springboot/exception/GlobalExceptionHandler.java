package com.example.springboot.exception;

import com.example.springboot.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 如果抛出的是ServiceException,则调用该方法
     * @Param se 业务异常
     *
     * */
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result handle(ServiceException se) {
        return Result.error(se.getCode(), se.getMessage());
    }
}
