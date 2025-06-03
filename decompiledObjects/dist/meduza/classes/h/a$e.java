package h;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

public final class a$e
  implements TimeInterpolator
{
  public int[] a;
  public int b;
  public int c;
  
  public a$e(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
  {
    int i = paramAnimationDrawable.getNumberOfFrames();
    b = i;
    int[] arrayOfInt = a;
    if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
      a = new int[i];
    }
    arrayOfInt = a;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      if (paramBoolean) {
        m = i - j - 1;
      } else {
        m = j;
      }
      int m = paramAnimationDrawable.getDuration(m);
      arrayOfInt[j] = m;
      k += m;
      j++;
    }
    c = k;
  }
  
  public final float getInterpolation(float paramFloat)
  {
    int i = (int)(paramFloat * c + 0.5F);
    int j = b;
    int[] arrayOfInt = a;
    for (int k = 0; k < j; k++)
    {
      int m = arrayOfInt[k];
      if (i < m) {
        break;
      }
      i -= m;
    }
    if (k < j) {
      paramFloat = i / c;
    } else {
      paramFloat = 0.0F;
    }
    return k / j + paramFloat;
  }
}

/* Location:
 * Qualified Name:     h.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */