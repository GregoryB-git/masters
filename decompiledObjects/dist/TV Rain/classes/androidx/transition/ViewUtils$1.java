package androidx.transition;

import android.util.Property;
import android.view.View;

final class ViewUtils$1
  extends Property<View, Float>
{
  public ViewUtils$1(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(View paramView)
  {
    return Float.valueOf(ViewUtils.getTransitionAlpha(paramView));
  }
  
  public void set(View paramView, Float paramFloat)
  {
    ViewUtils.setTransitionAlpha(paramView, paramFloat.floatValue());
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtils.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */