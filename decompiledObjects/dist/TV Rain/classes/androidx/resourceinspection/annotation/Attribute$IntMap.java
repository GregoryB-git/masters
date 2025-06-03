package androidx.resourceinspection.annotation;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({})
public @interface Attribute$IntMap
{
  int mask() default 0;
  
  @NonNull
  String name();
  
  int value();
}

/* Location:
 * Qualified Name:     androidx.resourceinspection.annotation.Attribute.IntMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */