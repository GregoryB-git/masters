package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewSpline$ProgressSet
  extends ViewSpline
{
  public boolean mNoMethod = false;
  
  public void setProperty(View paramView, float paramFloat)
  {
    if ((paramView instanceof MotionLayout))
    {
      ((MotionLayout)paramView).setProgress(get(paramFloat));
    }
    else
    {
      if (mNoMethod) {
        return;
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
          ((Method)localObject).invoke(paramView, new Object[] { Float.valueOf(get(paramFloat)) });
        }
        catch (InvocationTargetException paramView)
        {
          Log.e("ViewSpline", "unable to setProgress", paramView);
        }
        catch (IllegalAccessException paramView)
        {
          Log.e("ViewSpline", "unable to setProgress", paramView);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewSpline.ProgressSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */