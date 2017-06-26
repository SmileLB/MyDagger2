package com.example.administrator.mydagger2.anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by LiBing
 * on 2017/6/26 0026
 * describe:
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Test {
}
