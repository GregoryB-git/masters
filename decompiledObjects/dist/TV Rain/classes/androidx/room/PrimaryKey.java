package androidx.room;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
public @interface PrimaryKey
{
  boolean autoGenerate() default false;
}

/* Location:
 * Qualified Name:     androidx.room.PrimaryKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */