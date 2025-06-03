package L;

import android.view.animation.AnimationUtils;

public class a$a
{
  public int a;
  public int b;
  public float c;
  public float d;
  public long e = Long.MIN_VALUE;
  public long f = 0L;
  public int g = 0;
  public int h = 0;
  public long i = -1L;
  public float j;
  public int k;
  
  public void a()
  {
    if (f != 0L)
    {
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      float f1 = g(e(l1));
      long l2 = f;
      f = l1;
      f1 = (float)(l1 - l2) * f1;
      g = ((int)(c * f1));
      h = ((int)(f1 * d));
      return;
    }
    throw new RuntimeException("Cannot compute scroll delta before calling start()");
  }
  
  public int b()
  {
    return g;
  }
  
  public int c()
  {
    return h;
  }
  
  public int d()
  {
    float f1 = c;
    return (int)(f1 / Math.abs(f1));
  }
  
  public final float e(long paramLong)
  {
    long l1 = e;
    if (paramLong < l1) {
      return 0.0F;
    }
    long l2 = i;
    if ((l2 >= 0L) && (paramLong >= l2))
    {
      float f1 = j;
      return 1.0F - f1 + f1 * a.e((float)(paramLong - l2) / k, 0.0F, 1.0F);
    }
    return a.e((float)(paramLong - l1) / a, 0.0F, 1.0F) * 0.5F;
  }
  
  public int f()
  {
    float f1 = d;
    return (int)(f1 / Math.abs(f1));
  }
  
  public final float g(float paramFloat)
  {
    return -4.0F * paramFloat * paramFloat + paramFloat * 4.0F;
  }
  
  public boolean h()
  {
    boolean bool;
    if ((i > 0L) && (AnimationUtils.currentAnimationTimeMillis() > i + k)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void i()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    k = a.f((int)(l - e), 0, b);
    j = e(l);
    i = l;
  }
  
  public void j(int paramInt)
  {
    b = paramInt;
  }
  
  public void k(int paramInt)
  {
    a = paramInt;
  }
  
  public void l(float paramFloat1, float paramFloat2)
  {
    c = paramFloat1;
    d = paramFloat2;
  }
  
  public void m()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    e = l;
    i = -1L;
    f = l;
    j = 0.5F;
    g = 0;
    h = 0;
  }
}

/* Location:
 * Qualified Name:     L.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */