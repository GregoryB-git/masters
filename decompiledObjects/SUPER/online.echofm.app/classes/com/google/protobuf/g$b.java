package com.google.protobuf;

public final class g$b
  extends g
{
  public final byte[] e;
  public final boolean f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k = Integer.MAX_VALUE;
  
  public g$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    e = paramArrayOfByte;
    g = (paramInt2 + paramInt1);
    i = paramInt1;
    j = paramInt1;
    f = paramBoolean;
  }
  
  public int d()
  {
    return i - j;
  }
  
  public int e(int paramInt)
  {
    if (paramInt >= 0)
    {
      paramInt += d();
      if (paramInt >= 0)
      {
        int m = k;
        if (paramInt <= m)
        {
          k = paramInt;
          f();
          return m;
        }
        throw v.d();
      }
      throw v.c();
    }
    throw v.b();
  }
  
  public final void f()
  {
    int m = g + h;
    g = m;
    int n = m - j;
    int i1 = k;
    if (n > i1)
    {
      n -= i1;
      h = n;
      g = (m - n);
    }
    else
    {
      h = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */