package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;

class ViewTimeCycle$TranslationYset
  extends ViewTimeCycle
{
  public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    paramView.setTranslationY(get(paramFloat, paramLong, paramView, paramKeyCache));
    return mContinue;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewTimeCycle.TranslationYset
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */