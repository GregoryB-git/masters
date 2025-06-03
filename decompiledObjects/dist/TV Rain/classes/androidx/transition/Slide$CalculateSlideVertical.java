package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

abstract class Slide$CalculateSlideVertical
  implements Slide.CalculateSlide
{
  public float getGoneX(ViewGroup paramViewGroup, View paramView)
  {
    return paramView.getTranslationX();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Slide.CalculateSlideVertical
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */