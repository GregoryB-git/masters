package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

final class Slide$3
  extends Slide.CalculateSlideVertical
{
  public Slide$3()
  {
    super(null);
  }
  
  public float getGoneY(ViewGroup paramViewGroup, View paramView)
  {
    return paramView.getTranslationY() - paramViewGroup.getHeight();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Slide.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */