package org.example.exception;

import lombok.extern.slf4j.Slf4j;
import org.example.common.ApiResultEnum;
import org.example.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
