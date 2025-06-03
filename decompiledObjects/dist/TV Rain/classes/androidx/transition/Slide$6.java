package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

final class Slide$6
  extends Slide.CalculateSlideVertical
{
  public Slide$6()
  {
    super(null);
  }
  
  public float getGoneY(ViewGroup paramViewGroup, View paramView)
  {
    return paramView.getTranslationY() + paramViewGroup.getHeight();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Slide.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */