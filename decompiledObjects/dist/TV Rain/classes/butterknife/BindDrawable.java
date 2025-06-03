package butterknife;

import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface BindDrawable
{
  @AttrRes
  int tint() default -1;
  
  @DrawableRes
  int value();
}

/* Location:
 * Qualified Name:     butterknife.BindDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */