package com.google.android.datatransport.runtime.dagger;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface Subcomponent
{
  Class<?>[] modules() default {};
  
  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface Builder {}
  
  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface Factory {}
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.Subcomponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */