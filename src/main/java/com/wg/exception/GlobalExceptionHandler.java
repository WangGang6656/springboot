package com.wg.exception;

import com.wg.common.Result;
import lombok.extern.slf4j.Slf4j;
import com.wg.common.ApiResultEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result exception(Exception ex){
        log.error(ex.getMessage(),ex);
        return Result.error(ApiResultEnum.ERROR);
    }
}
