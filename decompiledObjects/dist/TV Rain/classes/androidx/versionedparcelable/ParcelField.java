package androidx.versionedparcelable;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({java.lang.annotation.ElementType.FIELD})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public @interface ParcelField
{
  String defaultValue() default "";
  
  int value();
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.ParcelField
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */