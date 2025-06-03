package com.google.protobuf;

public abstract class g
{
  public static volatile int d = 100;
  public int a = d;
  public int b = Integer.MAX_VALUE;
  public boolean c = false;
  
  public static g a(byte[] paramArrayOfByte)
  {
    return b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static g b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return c(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public static g c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new b(paramArrayOfByte, paramInt1, paramInt2, paramBoolean, null);
    try
    {
      paramArrayOfByte.e(paramInt2);
      return paramArrayOfByte;
    }
    catch (v paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public static final class b
    extends g
  {
    public final byte[] e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;
    
    public b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      super();
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
}

/* Location:
 * Qualified Name:     com.google.protobuf.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */