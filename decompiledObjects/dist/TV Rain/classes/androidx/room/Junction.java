package androidx.room;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({})
public @interface Junction
{
  String entityColumn() default "";
  
  String parentColumn() default "";
  
  Class<?> value();
}

/* Location:
 * Qualified Name:     androidx.room.Junction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */