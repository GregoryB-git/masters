package androidx.palette.graphics;

final class Palette$1
  implements Palette.Filter
{
  private static final float BLACK_MAX_LIGHTNESS = 0.05F;
  private static final float WHITE_MIN_LIGHTNESS = 0.95F;
  
  private boolean isBlack(float[] paramArrayOfFloat)
  {
    boolean bool;
    if (paramArrayOfFloat[2] <= 0.05F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isNearRedILine(float[] paramArrayOfFloat)
  {
    boolean bool1 = false;
    float f = paramArrayOfFloat[0];
    boolean bool2 = bool1;
    if (f >= 10.0F)
    {
      bool2 = bool1;
      if (f <= 37.0F)
      {
        bool2 = bool1;
        if (paramArrayOfFloat[1] <= 0.82F) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  private boolean isWhite(float[] paramArrayOfFloat)
  {
    boolean bool;
    if (paramArrayOfFloat[2] >= 0.95F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isAllowed(int paramInt, float[] paramArrayOfFloat)
  {
    boolean bool;
    if ((!isWhite(paramArrayOfFloat)) && (!isBlack(paramArrayOfFloat)) && (!isNearRedILine(paramArrayOfFloat))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.Palette.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */