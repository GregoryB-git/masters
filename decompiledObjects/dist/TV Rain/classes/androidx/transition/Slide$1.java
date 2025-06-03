package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

final class Slide$1
  extends Slide.CalculateSlideHorizontal
{
  public Slide$1()
  {
    super(null);
  }
  
  public float getGoneX(ViewGroup paramViewGroup, View paramView)
  {
    return paramView.getTranslationX() - paramViewGroup.getWidth();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Slide.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */