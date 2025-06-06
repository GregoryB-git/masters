package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(method={@butterknife.internal.ListenerMethod(defaultReturn="true", name="onTouch", parameters={"android.view.View", "android.view.MotionEvent"}, returnType="boolean")}, setter="setOnTouchListener", targetType="android.view.View", type="android.view.View.OnTouchListener")
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface OnTouch
{
  @IdRes
  int[] value() default {-1};
}

/* Location:
 * Qualified Name:     butterknife.OnTouch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */