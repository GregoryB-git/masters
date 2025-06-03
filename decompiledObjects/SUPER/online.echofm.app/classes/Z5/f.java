package Z5;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface f
{
  String c() default "";
  
  String f() default "";
  
  int[] l() default {};
  
  String m() default "";
  
  int v() default 1;
}

/* Location:
 * Qualified Name:     Z5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */