package androidx.versionedparcelable;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({java.lang.annotation.ElementType.TYPE})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public @interface VersionedParcelize
{
  boolean allowSerialization() default false;
  
  int[] deprecatedIds() default {};
  
  Class factory() default void.class;
  
  boolean ignoreParcelables() default false;
  
  boolean isCustom() default false;
  
  String jetifyAs() default "";
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.VersionedParcelize
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */