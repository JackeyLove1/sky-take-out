package com.sky.aop;

import com.sky.annotation.AutoFill;
import com.sky.enumeration.OperationType;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import static com.sky.enumeration.OperationType.*;

@Aspect
@Slf4j
@Component
public class AutoFillAspect {
    @Pointcut("execution(* com.sky.mapper.*.*(..)) && @annotation(com.sky.annotation.AutoFill)")
    public void autoFillPt() {
    }

    @Before("autoFillPt()")
    public void autoFill(ProceedingJoinPoint joinPoint) {
        log.info("开始进行公共字段自动填充...");
        // 获取到注解中定义的操作类型
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        AutoFill autoFill = signature.getMethod().getAnnotation(AutoFill.class);
        OperationType op = autoFill.value();

        Object[] args = joinPoint.getArgs();
        if (args == null || args.length == 0){
            return ;
        }
        Object entity = args[0];

        // (TODO): record operator id and method
        switch (op){
            case INSERT:
                log.info("开始进行插入操作的公共字段自动填充");
                break;
            case UPDATE:
                log.info("开始进行插入操作的公共字段自动填充");
                break;
            default:
                break;
        }
    }
}
