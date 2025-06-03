package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

final class Slide$5
  extends Slide.CalculateSlideHorizontal
{
  public Slide$5()
  {
    super(null);
  }
  
  public float getGoneX(ViewGroup paramViewGroup, View paramView)
  {
    int i = ViewCompat.getLayoutDirection(paramViewGroup);
    int j = 1;
    if (i != 1) {
      j = 0;
    }
    float f;
    if (j != 0) {
      f = paramView.getTranslationX() - paramViewGroup.getWidth();
    } else {
      f = paramView.getTranslationX() + paramViewGroup.getWidth();
    }
    return f;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Slide.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */