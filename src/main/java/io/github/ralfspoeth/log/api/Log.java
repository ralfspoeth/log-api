package io.github.ralfspoeth.log.api;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {
    String value();
    System.Logger.Level level() default System.Logger.Level.INFO;
}
