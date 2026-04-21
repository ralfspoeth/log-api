package io.github.ralfspoeth.log.api;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.MODULE, ElementType.PACKAGE, ElementType.TYPE})
public @interface LogAll {
    int modifier() default 0;
    String methodPattern() default ".*";
}
