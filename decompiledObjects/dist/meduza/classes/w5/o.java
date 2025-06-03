package w5;

import v3.g;
import v5.e0;

public final class o
  implements g
{
  public static final String e = e0.E(0);
  public static final String f = e0.E(1);
  public static final String o = e0.E(2);
  public static final String p = e0.E(3);
  public final int a;
  public final int b;
  public final int c;
  public final float d;
  
  public o(float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramFloat;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof o))
    {
      paramObject = (o)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b;
    int k = c;
    return Float.floatToRawIntBits(d) + (((217 + i) * 31 + j) * 31 + k) * 31;
  }
}

/* Location:
 * Qualified Name:     w5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */