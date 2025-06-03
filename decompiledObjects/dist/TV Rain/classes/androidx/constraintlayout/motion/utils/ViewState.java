package androidx.constraintlayout.motion.utils;

import android.view.View;

public class ViewState
{
  public int bottom;
  public int left;
  public int right;
  public float rotation;
  public int top;
  
  public void getState(View paramView)
  {
    left = paramView.getLeft();
    top = paramView.getTop();
    right = paramView.getRight();
    bottom = paramView.getBottom();
    rotation = paramView.getRotation();
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
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */