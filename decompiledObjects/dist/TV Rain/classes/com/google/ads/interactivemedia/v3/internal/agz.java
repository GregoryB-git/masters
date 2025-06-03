package com.google.ads.interactivemedia.v3.internal;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface agz
{
  Class a();
  
  String[] b() default {""};
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.agz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */