package d0;

import g0.M;

public final class P
{
  public static final P e = new P(0, 0);
  public static final String f = M.w0(0);
  public static final String g = M.w0(1);
  public static final String h = M.w0(2);
  public static final String i = M.w0(3);
  public final int a;
  public final int b;
  public final int c;
  public final float d;
  
  public P(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, 0, 1.0F);
  }
  
  public P(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramFloat;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof P))
    {
      paramObject = (P)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (((217 + a) * 31 + b) * 31 + c) * 31 + Float.floatToRawIntBits(d);
  }
}

/* Location:
 * Qualified Name:     d0.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */