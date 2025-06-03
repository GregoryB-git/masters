package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;

class ViewTimeCycle$RotationXset
  extends ViewTimeCycle
{
  public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    paramView.setRotationX(get(paramFloat, paramLong, paramView, paramKeyCache));
    return mContinue;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewTimeCycle.RotationXset
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */