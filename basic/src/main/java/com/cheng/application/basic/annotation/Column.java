package com.cheng.application.basic.annotation;

import java.lang.annotation.*;

/**
 * 字段
 * Created by cheshun on 2016/5/16.
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
    /**
     * 字段名
     */
    String value() default "";

    /**
     * 对应jdbc类型
     */
    String jdbcType() default "";

    /**
     * 说明
     */
    String comment() default "";
}
