package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import butterknife.internal.ListenerMethod;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(callbacks=Callback.class, setter="setOnItemSelectedListener", targetType="android.widget.AdapterView<?>", type="android.widget.AdapterView.OnItemSelectedListener")
@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface OnItemSelected
{
  Callback callback() default Callback.ITEM_SELECTED;
  
  @IdRes
  int[] value() default {-1};
  
  public static enum Callback
  {
    static
    {
      Callback localCallback1 = new Callback("ITEM_SELECTED", 0);
      ITEM_SELECTED = localCallback1;
      Callback localCallback2 = new Callback("NOTHING_SELECTED", 1);
      NOTHING_SELECTED = localCallback2;
      $VALUES = new Callback[] { localCallback1, localCallback2 };
    }
    
    private Callback() {}
  }
}

/* Location:
 * Qualified Name:     butterknife.OnItemSelected
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */