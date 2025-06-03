package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;

public class ViewTimeCycle$PathRotate
  extends ViewTimeCycle
{
  public boolean setPathRotate(View paramView, KeyCache paramKeyCache, float paramFloat, long paramLong, double paramDouble1, double paramDouble2)
  {
    paramView.setRotation(get(paramFloat, paramLong, paramView, paramKeyCache) + (float)Math.toDegrees(Math.atan2(paramDouble2, paramDouble1)));
    return mContinue;
  }
  
  public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    return mContinue;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */