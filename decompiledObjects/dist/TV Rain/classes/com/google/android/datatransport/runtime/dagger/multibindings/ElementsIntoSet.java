package com.google.android.datatransport.runtime.dagger.multibindings;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface ElementsIntoSet {}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.multibindings.ElementsIntoSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */