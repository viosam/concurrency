package com.lwc.concurrency.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来标识线程安全的类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {

    String value() default "";

}
