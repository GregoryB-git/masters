package androidx.constraintlayout.motion.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;

class MotionLayout$MyTracker
  implements MotionLayout.MotionTracker
{
  private static MyTracker me = new MyTracker();
  public VelocityTracker tracker;
  
  public static MyTracker obtain()
  {
    metracker = VelocityTracker.obtain();
    return me;
  }
  
  public void addMovement(MotionEvent paramMotionEvent)
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null) {
      localVelocityTracker.addMovement(paramMotionEvent);
    }
  }
  
  public void clear()
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null) {
      localVelocityTracker.clear();
    }
  }
  
  public void computeCurrentVelocity(int paramInt)
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null) {
      localVelocityTracker.computeCurrentVelocity(paramInt);
    }
  }
  
  public void computeCurrentVelocity(int paramInt, float paramFloat)
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null) {
      localVelocityTracker.computeCurrentVelocity(paramInt, paramFloat);
    }
  }
  
  public float getXVelocity()
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null) {
      return localVelocityTracker.getXVelocity();
    }
    return 0.0F;
  }
  
  public float getXVelocity(int paramInt)
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null) {
      return localVelocityTracker.getXVelocity(paramInt);
    }
    return 0.0F;
  }
  
  public float getYVelocity()
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null) {
      return localVelocityTracker.getYVelocity();
    }
    return 0.0F;
  }
  
  public float getYVelocity(int paramInt)
  {
    if (tracker != null) {
      return getYVelocity(paramInt);
    }
    return 0.0F;
  }
  
  public void recycle()
  {
    VelocityTracker localVelocityTracker = tracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      tracker = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.MyTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */