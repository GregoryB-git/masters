package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.SplineSet;

public class ViewSpline$PathRotate
  extends ViewSpline
{
  public void setPathRotate(View paramView, float paramFloat, double paramDouble1, double paramDouble2)
  {
    paramView.setRotation(get(paramFloat) + (float)Math.toDegrees(Math.atan2(paramDouble2, paramDouble1)));
  }
  
  public void setProperty(View paramView, float paramFloat) {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewSpline.PathRotate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */