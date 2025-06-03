package v3;

import r3.j;
import v5.e0;

public final class o0$e
  implements g
{
  public static final e f = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38F, -3.4028235E38F);
  public static final String o = e0.E(0);
  public static final String p = e0.E(1);
  public static final String q = e0.E(2);
  public static final String r = e0.E(3);
  public static final String s = e0.E(4);
  public static final j t = new j(8);
  public final long a;
  public final long b;
  public final long c;
  public final float d;
  public final float e;
  
  @Deprecated
  public o0$e(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramLong3;
    d = paramFloat1;
    e = paramFloat2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    int j = (int)(l ^ l >>> 32);
    l = c;
    int k = (int)(l >>> 32 ^ l);
    float f1 = d;
    int m = 0;
    int n;
    if (f1 != 0.0F) {
      n = Float.floatToIntBits(f1);
    } else {
      n = 0;
    }
    f1 = e;
    if (f1 != 0.0F) {
      m = Float.floatToIntBits(f1);
    }
    return (((i * 31 + j) * 31 + k) * 31 + n) * 31 + m;
  }
  
  public static final class a
  {
    public long a;
    public long b;
    public long c;
    public float d;
    public float e;
    
    public a()
    {
      a = -9223372036854775807L;
      b = -9223372036854775807L;
      c = -9223372036854775807L;
      d = -3.4028235E38F;
      e = -3.4028235E38F;
    }
    
    public a(o0.e parame)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
    }
  }
}

/* Location:
 * Qualified Name:     v3.o0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */