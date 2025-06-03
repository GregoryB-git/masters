package butterknife;

import androidx.annotation.FontRes;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface BindFont
{
  @TypefaceStyle
  int style() default 0;
  
  @FontRes
  int value();
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface TypefaceStyle {}
}

/* Location:
 * Qualified Name:     butterknife.BindFont
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */