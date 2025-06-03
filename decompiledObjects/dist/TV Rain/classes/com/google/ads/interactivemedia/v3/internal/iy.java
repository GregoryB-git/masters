package com.google.ads.interactivemedia.v3.internal;

public final class iy
  implements jj
{
  private final iz a;
  private final vy b;
  private int c;
  private int d;
  private boolean e;
  private boolean f;
  
  public iy(iz paramiz)
  {
    a = paramiz;
    b = new vy(32);
  }
  
  public final void a()
  {
    f = true;
  }
  
  public final void a(vy paramvy, int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int i;
    if (paramInt != 0)
    {
      i = paramvy.e();
      i = paramvy.d() + i;
    }
    else
    {
      i = 0;
    }
    if (f)
    {
      if (paramInt == 0) {
        return;
      }
      f = false;
      paramvy.c(i);
      d = 0;
    }
    while (paramvy.b() > 0)
    {
      paramInt = d;
      if (paramInt < 3)
      {
        if (paramInt == 0)
        {
          paramInt = paramvy.e();
          paramvy.c(paramvy.d() - 1);
          if (paramInt == 255)
          {
            f = true;
            return;
          }
        }
        paramInt = Math.min(paramvy.b(), 3 - d);
        paramvy.a(b.a, d, paramInt);
        paramInt = d + paramInt;
        d = paramInt;
        if (paramInt == 3)
        {
          b.a(3);
          b.d(1);
          paramInt = b.e();
          i = b.e();
          boolean bool;
          if ((paramInt & 0x80) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          e = bool;
          paramInt = ((paramInt & 0xF) << 8 | i) + 3;
          c = paramInt;
          vy localvy = b;
          byte[] arrayOfByte = a;
          if (arrayOfByte.length < paramInt)
          {
            localvy.a(Math.min(4098, Math.max(paramInt, arrayOfByte.length << 1)));
            System.arraycopy(arrayOfByte, 0, b.a, 0, 3);
          }
        }
      }
      else
      {
        paramInt = Math.min(paramvy.b(), c - d);
        paramvy.a(b.a, d, paramInt);
        paramInt = d + paramInt;
        d = paramInt;
        i = c;
        if (paramInt == i)
        {
          if (e)
          {
            if (wl.a(b.a, 0, i, -1) != 0)
            {
              f = true;
              return;
            }
            b.a(c - 4);
          }
          else
          {
            b.a(i);
          }
          a.a(b);
          d = 0;
        }
      }
    }
  }
  
  public final void a(wi paramwi, fy paramfy, jn paramjn)
  {
    a.a(paramwi, paramfy, paramjn);
    f = true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.iy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */