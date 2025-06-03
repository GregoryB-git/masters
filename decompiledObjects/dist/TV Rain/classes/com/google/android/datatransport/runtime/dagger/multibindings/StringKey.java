package com.google.android.datatransport.runtime.dagger.multibindings;

import com.google.android.datatransport.runtime.dagger.MapKey;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MapKey
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface StringKey
{
  String value();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.multibindings.StringKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */