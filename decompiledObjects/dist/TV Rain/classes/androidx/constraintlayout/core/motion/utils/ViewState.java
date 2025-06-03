package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;

public class ViewState
{
  public int bottom;
  public int left;
  public int right;
  public float rotation;
  public int top;
  
  public void getState(MotionWidget paramMotionWidget)
  {
    left = paramMotionWidget.getLeft();
    top = paramMotionWidget.getTop();
    right = paramMotionWidget.getRight();
    bottom = paramMotionWidget.getBottom();
    rotation = ((int)paramMotionWidget.getRotationZ());
  }
  
  public int height()
  {
    return bottom - top;
  }
  
  public int width()
  {
    return right - left;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.ViewState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */