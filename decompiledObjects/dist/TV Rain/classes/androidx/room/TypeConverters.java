package androidx.room;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
public @interface TypeConverters
{
  Class<?>[] value();
}

/* Location:
 * Qualified Name:     androidx.room.TypeConverters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */