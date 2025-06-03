package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

abstract class Slide$CalculateSlideHorizontal
  implements Slide.CalculateSlide
{
  public float getGoneY(ViewGroup paramViewGroup, View paramView)
  {
    return paramView.getTranslationY();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Slide.CalculateSlideHorizontal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */