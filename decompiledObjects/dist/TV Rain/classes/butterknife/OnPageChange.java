package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import butterknife.internal.ListenerMethod;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(callbacks=Callback.class, remover="removeOnPageChangeListener", setter="addOnPageChangeListener", targetType="androidx.viewpager.widget.ViewPager", type="androidx.viewpager.widget.ViewPager.OnPageChangeListener")
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface OnPageChange
{
  Callback callback() default Callback.PAGE_SELECTED;
  
  @IdRes
  int[] value() default {-1};
  
  public static enum Callback
  {
    static
    {
      Callback localCallback1 = new Callback("PAGE_SELECTED", 0);
      PAGE_SELECTED = localCallback1;
      Callback localCallback2 = new Callback("PAGE_SCROLLED", 1);
      PAGE_SCROLLED = localCallback2;
      Callback localCallback3 = new Callback("PAGE_SCROLL_STATE_CHANGED", 2);
      PAGE_SCROLL_STATE_CHANGED = localCallback3;
      $VALUES = new Callback[] { localCallback1, localCallback2, localCallback3 };
    }
    
    private Callback() {}
  }
}

/* Location:
 * Qualified Name:     butterknife.OnPageChange
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */