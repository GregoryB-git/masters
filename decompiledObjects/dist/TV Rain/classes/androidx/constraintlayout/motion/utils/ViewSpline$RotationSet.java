package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.SplineSet;

class ViewSpline$RotationSet
  extends ViewSpline
{
  public void setProperty(View paramView, float paramFloat)
  {
    paramView.setRotation(get(paramFloat));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewSpline.RotationSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */