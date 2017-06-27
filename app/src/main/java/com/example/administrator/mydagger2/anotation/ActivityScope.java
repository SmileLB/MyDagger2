package com.example.administrator.mydagger2.anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Description:
 * Created by LiBing
 * Data:2017/6/27 10:11
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
