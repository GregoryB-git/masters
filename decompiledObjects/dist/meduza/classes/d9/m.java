package d9;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
public @interface m {}

/* Location:
 * Qualified Name:     d9.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */