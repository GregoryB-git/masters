package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewTimeCycle$ProgressSet
  extends ViewTimeCycle
{
  public boolean mNoMethod = false;
  
  public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    if ((paramView instanceof MotionLayout))
    {
      ((MotionLayout)paramView).setProgress(get(paramFloat, paramLong, paramView, paramKeyCache));
    }
    else
    {
      if (mNoMethod) {
        return false;
      }
      Object localObject = null;
      try
      {
        Method localMethod = paramView.getClass().getMethod("setProgress", new Class[] { Float.TYPE });
        localObject = localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        mNoMethod = true;
      }
      if (localObject != null) {
        try
        {
          ((Method)localObject).invoke(paramView, new Object[] { Float.valueOf(get(paramFloat, paramLong, paramView, paramKeyCache)) });
        }
        catch (InvocationTargetException paramView)
        {
          Log.e("ViewTimeCycle", "unable to setProgress", paramView);
        }
        catch (IllegalAccessException paramView)
        {
          Log.e("ViewTimeCycle", "unable to setProgress", paramView);
        }
      }
    }
    return mContinue;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewTimeCycle.ProgressSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */