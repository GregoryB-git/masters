package androidx.room;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface Delete
{
  Class<?> entity() default Object.class;
}

/* Location:
 * Qualified Name:     androidx.room.Delete
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */