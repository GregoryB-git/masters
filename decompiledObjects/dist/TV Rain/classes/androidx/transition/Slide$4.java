package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

final class Slide$4
  extends Slide.CalculateSlideHorizontal
{
  public Slide$4()
  {
    super(null);
  }
  
  public float getGoneX(ViewGroup paramViewGroup, View paramView)
  {
    return paramView.getTranslationX() + paramViewGroup.getWidth();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Slide.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */