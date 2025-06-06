package androidx.constraintlayout.core.motion.utils;

public class FloatRect
{
  public float bottom;
  public float left;
  public float right;
  public float top;
  
  public final float centerX()
  {
    return (left + right) * 0.5F;
  }
  
  public final float centerY()
  {
    return (top + bottom) * 0.5F;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.FloatRect
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */