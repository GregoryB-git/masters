package com.google.android.gms.internal.measurement;

public final class F3
  extends G3
{
  public final byte[] e;
  public final boolean f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k = Integer.MAX_VALUE;
  
  public F3(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    e = paramArrayOfByte;
    g = (paramInt2 + paramInt1);
    i = paramInt1;
    j = paramInt1;
    f = paramBoolean;
  }
  
  public final int a(int paramInt)
  {
    if (paramInt >= 0)
    {
      int m = paramInt + d();
      if (m >= 0)
      {
        paramInt = k;
        if (m <= paramInt)
        {
          k = m;
          f();
          return paramInt;
        }
        throw k4.f();
      }
      throw k4.e();
    }
    throw k4.d();
  }
  
  public final int d()
  {
    return i - j;
  }
  
  public final void f()
  {
    int m = g + h;
    g = m;
    int n = m - j;
    int i1 = k;
    if (n > i1)
    {
      i1 = n - i1;
      h = i1;
      g = (m - i1);
      return;
    }
    h = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.F3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */