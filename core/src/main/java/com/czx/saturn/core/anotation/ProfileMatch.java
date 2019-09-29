package com.czx.saturn.core.anotation;

import com.czx.saturn.common.constants.ProfileType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

//先定义注解@Anotation
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ProfileMatch {
    ProfileType value();
}
