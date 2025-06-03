package androidx.constraintlayout.core.motion.utils;

public class Rect
{
  public int bottom;
  public int left;
  public int right;
  public int top;
  
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
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Rect
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */