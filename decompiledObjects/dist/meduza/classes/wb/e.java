package wb;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface e
{
  String c() default "";
  
  String f() default "";
  
  int[] l() default {};
  
  String m() default "";
  
  int v() default 1;
}

/* Location:
 * Qualified Name:     wb.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */