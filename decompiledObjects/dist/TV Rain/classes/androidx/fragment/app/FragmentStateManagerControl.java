package androidx.fragment.app;

import androidx.annotation.experimental.Experimental;
import androidx.annotation.experimental.Experimental.Level;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD})
@Experimental(level=Experimental.Level.WARNING)
public @interface FragmentStateManagerControl {}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentStateManagerControl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */