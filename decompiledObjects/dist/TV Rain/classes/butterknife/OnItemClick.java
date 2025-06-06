package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(method={@butterknife.internal.ListenerMethod(name="onItemClick", parameters={"android.widget.AdapterView<?>", "android.view.View", "int", "long"})}, setter="setOnItemClickListener", targetType="android.widget.AdapterView<?>", type="android.widget.AdapterView.OnItemClickListener")
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface OnItemClick
{
  @IdRes
  int[] value() default {-1};
}

/* Location:
 * Qualified Name:     butterknife.OnItemClick
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */