package com.yandex.metrica;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
public @interface DoNotInline {}

/* Location:
 * Qualified Name:     com.yandex.metrica.DoNotInline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */