package s;

import android.graphics.drawable.Drawable;

public abstract class e
  extends Drawable
{
  public static final double a = Math.cos(Math.toRadians(45.0D));
  
  public static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1;
    if (paramBoolean) {
      f = (float)(paramFloat1 + (1.0D - a) * paramFloat2);
    }
    return f;
  }
  
  public static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1 * 1.5F;
    paramFloat1 = f;
    if (paramBoolean) {
      paramFloat1 = (float)(f + (1.0D - a) * paramFloat2);
    }
    return paramFloat1;
  }
}

/* Location:
 * Qualified Name:     s.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */