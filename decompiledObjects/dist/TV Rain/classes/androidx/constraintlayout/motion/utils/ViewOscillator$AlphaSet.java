package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;

class ViewOscillator$AlphaSet
  extends ViewOscillator
{
  public void setProperty(View paramView, float paramFloat)
  {
    paramView.setAlpha(get(paramFloat));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewOscillator.AlphaSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */