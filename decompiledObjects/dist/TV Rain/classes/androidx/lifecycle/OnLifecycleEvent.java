package androidx.lifecycle;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface OnLifecycleEvent
{
  Lifecycle.Event value();
}

/* Location:
 * Qualified Name:     androidx.lifecycle.OnLifecycleEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */