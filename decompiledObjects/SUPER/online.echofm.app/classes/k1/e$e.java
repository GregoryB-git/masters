package k1;

import android.text.Layout.Alignment;
import f0.a.b;
import g0.o;

public final class e$e
{
  public long a = 0L;
  public long b = 0L;
  public CharSequence c;
  public int d = 2;
  public float e = -3.4028235E38F;
  public int f = 1;
  public int g = 0;
  public float h = -3.4028235E38F;
  public int i = Integer.MIN_VALUE;
  public float j = 1.0F;
  public int k = Integer.MIN_VALUE;
  
  public static float b(float paramFloat, int paramInt)
  {
    boolean bool = paramFloat < -3.4028235E38F;
    if ((bool) && (paramInt == 0) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) {
      return 1.0F;
    }
    if (bool) {
      return paramFloat;
    }
    if (paramInt == 0) {
      return 1.0F;
    }
    return -3.4028235E38F;
  }
  
  public static Layout.Alignment c(int paramInt)
  {
    if (paramInt != 1) {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt == 4) {
            break label65;
          }
          if (paramInt != 5)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Unknown textAlignment: ");
            localStringBuilder.append(paramInt);
            o.h("WebvttCueParser", localStringBuilder.toString());
            return null;
          }
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
      }
      else
      {
        return Layout.Alignment.ALIGN_CENTER;
      }
    }
    label65:
    return Layout.Alignment.ALIGN_NORMAL;
  }
  
  public static float d(int paramInt, float paramFloat)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          return paramFloat;
        }
        throw new IllegalStateException(String.valueOf(paramInt));
      }
      if (paramFloat <= 0.5F) {
        return paramFloat * 2.0F;
      }
      return (1.0F - paramFloat) * 2.0F;
    }
    return 1.0F - paramFloat;
  }
  
  public static float e(int paramInt)
  {
    if (paramInt != 4)
    {
      if (paramInt != 5) {
        return 0.5F;
      }
      return 1.0F;
    }
    return 0.0F;
  }
  
  public static int f(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 3)
      {
        if (paramInt == 4) {
          break label24;
        }
        if (paramInt != 5) {
          return 1;
        }
      }
      return 2;
    }
    label24:
    return 0;
  }
  
  public d a()
  {
    return new d(g().a(), a, b);
  }
  
  public a.b g()
  {
    float f1 = h;
    if (f1 == -3.4028235E38F) {
      f1 = e(d);
    }
    int m = i;
    if (m == Integer.MIN_VALUE) {
      m = f(d);
    }
    a.b localb = new a.b().p(c(d)).h(b(e, f), f).i(g).k(f1).l(m).n(Math.min(j, d(m, f1))).r(k);
    CharSequence localCharSequence = c;
    if (localCharSequence != null) {
      localb.o(localCharSequence);
    }
    return localb;
  }
}

/* Location:
 * Qualified Name:     k1.e.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */