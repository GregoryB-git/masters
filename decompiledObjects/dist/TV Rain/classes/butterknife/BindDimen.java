package butterknife;

import androidx.annotation.DimenRes;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface BindDimen
{
  @DimenRes
  int value();
}

/* Location:
 * Qualified Name:     butterknife.BindDimen
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */